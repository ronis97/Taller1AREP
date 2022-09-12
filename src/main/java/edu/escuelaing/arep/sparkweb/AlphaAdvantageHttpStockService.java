package edu.escuelaing.arep.sparkweb;

public class AlphaAdvantageHttpStockService extends HttpStockService{

    @Override
    public String getURL(String timeSeries, String stock) {
        // TODO Auto-generated method stub
        return "https://www.alphavantage.co/query?function=TIME_SERIES_"+timeSeries+"&symbol="+stock+"&interval=5min&apikey=976MWGKK4HB0UREA";
    }

    
}
