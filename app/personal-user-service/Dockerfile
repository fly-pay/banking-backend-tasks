FROM maven:3.8.7-eclipse-temurin-17 as build

COPY src/main/proto ./src/main/proto

FROM eclipse-temurin:17-jre

COPY ./target/personal-user-service-0.0.1-SNAPSHOT.jar personal-user-app.jar
EXPOSE 3501 7094
ENTRYPOINT ["java","-jar","app.jar"]
