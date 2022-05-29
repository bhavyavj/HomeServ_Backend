
FROM openjdk:8

EXPOSE 8000
WORKDIR ./
COPY ./FinalProject/target/FinalProject-0.0.1-SNAPSHOT.jar ./


CMD ["java","-jar","FinalProject-0.0.1-SNAPSHOT.jar"]


