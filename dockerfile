# Use a base image with Java runtime
FROM openjdk:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the Spring Boot jar file to the container
COPY build/libs/transactions-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your application runs on
EXPOSE 8080

# Set the entry point for the container to run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]
