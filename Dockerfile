FROM openjdk:8
EXPOSE 8080
ADD target/demo-0.0.1.jar demo.jar
ENTRYPOINT ["java","-jar","/demo.jar"]