FROM openjdk:19
MAINTAINER myname
COPY /project-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]