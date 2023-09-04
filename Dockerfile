# Use an official OpenJDK runtime as a parent image
FROM openjdk:latest

# Set the working directory to /app
WORKDIR /app

# Copy the JAR file into the container at /app
COPY target/summitshare-0.0.1-SNAPSHOT.jar ./app.jar

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Define environment variable
# ENV NAME="World"

# Run the JAR file
CMD ["java", "-jar", "app.jar"]