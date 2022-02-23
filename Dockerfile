FROM eclipse-temurin:17-alpine

WORKDIR /app

#COPY build/libs/cdk-config-demo-0.0.1-SNAPSHOT.jar app.jar
#ENTRYPOINT ["java", "-jar", "/app/app.jar"]
ENTRYPOINT ["java"]
