FROM java:openjdk-8
COPY target/erp-0.1.0-SNAPSHOT.jar /erp-0.1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/erp-0.1.0-SNAPSHOT.jar"]