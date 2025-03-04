FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

RUN apt-get update && apt-get install -y netcat

COPY target/backend-travel-service-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8000

ENTRYPOINT ["java", "-jar", "app.jar"]
