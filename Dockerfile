FROM openjdk:11-jre-slim
VOLUME /tmp
WORKDIR /app
COPY target/customer-api-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
