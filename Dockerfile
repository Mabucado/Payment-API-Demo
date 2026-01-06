# Use official OpenJDK 17 image
FROM openjdk:17-jdk-slim-buster

# Set working directory in the container
WORKDIR /app

# Copy Maven wrapper and pom.xml first for caching
COPY mvnw pom.xml ./
COPY .mvn .mvn

# Give execute permission to Maven wrapper
RUN chmod +x mvnw

# Copy the source code
COPY src src

# Build the app (skip tests to speed up)
RUN ./mvnw clean package -DskipTests

# Expose port 8080
EXPOSE 8080

# Run the Spring Boot jar
CMD ["java", "-jar", "target/demo-0.0.1-SNAPSHOT.jar"]
