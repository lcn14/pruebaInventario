FROM amazoncorretto:17-alpine
# Copia el archivo JAR a la imagen
COPY target/inventarios-0.0.1-SNAPSHOT.jar app.jar

# Expone el puerto en el que tu API escucha (ajusta si usas otro puerto)
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "/app.jar"]