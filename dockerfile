FROM openjdk:8-jdk-alpine
ARG JAR_FILE
COPY ${JAR_FILE} thor.jar
ENTRYPOINT ["java","-jar","thor.jar"]
