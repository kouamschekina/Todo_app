FROM  maven:3.8.4-openjdk-17 AS build

WORKDIR /app

COPY . /app

RUN mvn package

FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY --from=build /app/target/ToDo_app-0.0.1-SNAPSHOT.jar /app/app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/app.jar"]


