# Use the official maven/Java image to create a build artifact.
FROM maven:3.6.0-jdk-11-slim AS build
WORKDIR /src/app
COPY . .
RUN mvn clean package

# Use the official OpenJDK image as the base image.
FROM openjdk:11-jre-slim
COPY --from=build /target/rbapp-be-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
