FROM openjdk:11

WORKDIR /app
COPY ./target/*.jar /app/dockerchalleng.jar

ENTRYPOINT ["java","-jar","/app/dockerchalleng.jar"]