FROM openjdk:8
EXPOSE 8080
ADD target/Company.jar Company.jar
ENTRYPOINT ["java","-jar","/Company.jar"]