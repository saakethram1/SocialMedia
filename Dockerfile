FROM maven:3.8.6-openjdk-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests


FROM openjdk:17
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 5454
CMD ["java", "-jar", "app.jar"]
