Proyecto creado en SpringBoot
*Función soap extraer tipo de cambio de Banco de Guatemala.
*Spring Boot 3.3.5
*Java 17
*Mysql 8.2 
*Descarga: Apache Maven.


*Base de Datos.
create database tipocambio


*Tabla usada.
CREATE TABLE tipo_cambio (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    xml_response LONGTEXT,
    timestamp DATETIME
);



