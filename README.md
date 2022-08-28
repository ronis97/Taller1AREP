# Primer taller de AREP

API Spark web que recoge datos JSON

## Preparacion

Clonamos el repositorio con la siguiente instrucción en consola:

```
git clone https://github.com/ronis97/Taller1AREP.git
```
Entramos a la carpeta creada:

```
cd SparkWebApp
```

### Prerrequisitos

Necesitamos de:
* Maven
* VS code

Para una correcta ejecucion del aplicativo.

### Ejecucion

Ejecutamos la siguiente instruccion en consola:

```
mvn package
```

con esto maven se encargara de descargar todos los recursos necesarios para la ejecucion del aplicativo.

Para ejecutar el programa simplemente corremos la instrucción:

```
mvn exec:java -Dexec.mainClass="edu.escuelaing.arep.sparkweb.SparkWebApp" 
```

En el navegador entramos con la dirección:

```
http://localhost:4567
```

Podemos visualizar la ventana donde podemos escoger el stock, y el time series

![](https://github.com/ronis97/Taller1AREP/blob/main/imgs/index.PNG)

Le damos click a submit y veremos el formato JSON del stock solicitado.

![](https://github.com/ronis97/Taller1AREP/blob/main/imgs/JSON%20result.PNG)

### Despliegue

[![Deploy](https://www.herokucdn.com/deploy/button.svg)](https://vast-badlands-50797.herokuapp.com)


