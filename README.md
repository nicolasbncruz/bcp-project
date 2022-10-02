## Para levantar la Aplicación:

1. Abrir Proyecto en Intellij IDEA Community

2. Abrir en Power Shell la ubicación del proyecto

3. Ejecutar lo siguiente:
```
mvn clean install -DskipTests
```
4. Conectarse a Mysql y crear la base de datos
```
CREATE DATABASE bcp_project;
```
5. Configurar el archivo `application.properties` de acuerdo a su configuración local
```
spring.datasource.username = root
spring.datasource.password = mysql
```
6. Ejecutar la aplicación
7. Consumir los servicios rest expuestos en postman adjunto
