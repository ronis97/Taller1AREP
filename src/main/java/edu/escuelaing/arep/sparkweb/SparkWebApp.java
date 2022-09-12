package edu.escuelaing.arep.sparkweb;

import spark.Request;
import spark.Response;

import static spark.Spark.*;

import java.io.IOException;
//change

public class SparkWebApp {
    private static final MemoryCache<String, String> memoryCache = new MemoryCache<String,String>(5000,5000,100);
    public static void main(String[] args) {
        staticFileLocation("/public");
        staticFiles.location("/public");
        port(getPort());
        // get("/stock", (req, res) -> {
        //     res.type("application/json");
        //     return ApiAdvantageReader.getStock();
        //     });
        // get("/inputDataStockService", SparkWebApp::inputDataPageStockService);
        get("/stockService", SparkWebApp::stockService);
        get("/iexService", SparkWebApp::iexService);
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }



    private static String stockService(Request req, Response res){
        String response = "None";
        try {
            response = HttpStockService.getAlphaService().getStockInfoAsJSON(req);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }

    private static String iexService(Request req, Response res){
        String response = "None";
        try{
            response = IEXCloudHttpStockService.getIEXService().getStockInfoAsJSON(req);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (memoryCache.get(req.url()) == null){
            memoryCache.put(req.url(),response);
            return response;
        }else {
            return memoryCache.get(req.url());
        }
    }
}
