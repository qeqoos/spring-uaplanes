# Use the official OpenJDK 17 image as the base image (it contains Java 17 needed for app)
FROM openjdk:17-alpine

# Set the working directory to /app in the container and automatically go there
WORKDIR /app

# Copy the application JAR file to /app
# First arg points to file on our system and second file is the destination inside container
COPY build/libs/uaplanes-*.jar /app/uaplanes.jar

# DOCUMENT that app will work on port 8080 for incoming traffic
EXPOSE 8080

# Run the application when the container starts
ENTRYPOINT ["java", "-jar", "/app/uaplanes.jar"]