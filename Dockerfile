FROM amazoncorretto:17-alpine-jdk
MAINTAINER ElyJF
COPY target/ElyJF-0.0.1-SNAPSHOT.jar ElyJF.jar
ENTRYPOINT ["java", "-jar","/ElyJF.jar"]
EXPOSE  8080

