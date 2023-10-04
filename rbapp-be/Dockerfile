# Use Maven to build the application
FROM maven:3.6-jdk-11 as build
WORKDIR /app
COPY . /app
RUN mvn clean package

# Run the application
FROM openjdk:11-jre-slim
COPY --from=build /app/target/*.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]

