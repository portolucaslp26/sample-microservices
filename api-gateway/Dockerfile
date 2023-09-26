FROM maven:3.8.4-openjdk-17

WORKDIR /app

COPY . .

RUN mvn package

CMD ["java", "-jar", "api-gateway-0.0.1-SNAPSHOT.jar"]