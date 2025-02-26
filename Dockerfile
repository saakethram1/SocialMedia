FROM openjdk:17
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 5454
CMD ["java", "-jar", "app.jar"]
