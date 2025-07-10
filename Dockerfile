# Step 1: Build woirking directory
FROM maven:3.9.9-eclipse-temurin-17 AS build

ENV SPRING_PROFILES_ACTIVE=prod

WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline

COPY src ./src

RUN mvn package -DskipTests

# Step 2: Create the final image
FROM eclipse-temurin:17-jre AS runtime
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar

# Step 3
# Expose the port your spring boot application listens on (default is 8080)
EXPOSE 8080
# Define the command to run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]

# Note: The application will run with the 'prod' profile as set in the build stage.
# This Dockerfile is designed to be used in a CI/CD pipeline or for local development.
# It is necessary to define the following environment variables in the hosting provider for the application to
# run correctly in the Production environment:
# - DATABASE_NAME: The name of the database to connect to.
# - DATABASE_USER: The username for the database connection.
# - DATABASE_PASSWORD: The password for the database connection.
# - DATABASE_URL: The URL of the database to connect to.
# - PORT: The port on which the application will run (default is 8080).
# - SPRING_PROFILES_ACTIVE: The active Spring profile (Must be 'prod' to use the runtime configuration).