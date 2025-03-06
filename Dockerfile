##use Openjdk base image
#FROM openjdk:17-jdk-slim
##add application
##(1)
#ADD target/Hello.jar app
##======================
##(2)
##WORKDIR /app
##COPY target/hello.jar /app/app.jar
##+++++++++++++++++++++++++++++++++
#
##Expose the port that the app will run on
#EXPOSE 8080
#
#ENTRYPOINT ["java","-jar","app.jar"]
# Use OpenJDK base image
FROM openjdk:17-jdk-slim

# Set working directory inside the container
WORKDIR /app

# Copy the built JAR file into the container
COPY target/Hello.jar app.jar

# Expose the port that the app will run on
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
