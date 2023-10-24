# Usar una imagen base de Java
FROM openjdk:17-jdk-alpine

# Copiar el archivo JAR a la imagen
COPY target/tecnical-0.0.1-SNAPSHOT.jar tecnical-app.jar

# Levantar el contenedor en java
ENTRYPOINT ["java", "-jar", "tecnical-app.jar"]
