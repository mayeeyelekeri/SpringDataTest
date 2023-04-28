FROM openjdk:8-jdk-alpine
MAINTAINER mahesh

# These variables should be passed while running the container 
ENV MYSQL_HOST=localhost
ENV MYSQL_DATABASE=info
ENV MYSQL_USER=info
ENV MYSQL_PASSWORD=info
ENV MYSQL_PORT=3306

EXPOSE 8080

COPY SpringDataTest-0.0.1-SNAPSHOT.jar SpringDataTest-0.0.1-SNAPSHOT.jar 

ENTRYPOINT ["java", "-Dspring.profiles.active=aws" , "-jar", "/SpringDataTest-0.0.1-SNAPSHOT.jar"]
