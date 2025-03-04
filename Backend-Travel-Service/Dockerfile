FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

RUN apt-get update && apt-get install -y netcat

COPY target/backend-travel-service-0.0.1-SNAPSHOT.jar app.jar

COPY wait-for-it.sh /wait-for-it.sh
RUN chmod +x /wait-for-it.sh

EXPOSE 8000

ENTRYPOINT ["/wait-for-it.sh", "postgres_con:5432", "--", "java", "-jar", "app.jar"]

