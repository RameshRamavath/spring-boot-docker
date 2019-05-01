## FROM - Give base Image name here - which will be detting downloaded from Docker hub - Similar to maven repo

## ADD - Place our jar into docker container loaction - place it in current dir

## EXPOSE - Port in which our Application is running from Docker

## ENTRYPOINT - Starting point for Docker image. Commands and arguments to run our application

FROM openjdk:8
ADD target/spring-boot-docker.jar spring-boot-docker.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","spring-boot-docker.jar"]



## building docker Image

 # docker build -f Dockerfile -t docker-spring-boot
 ## -f :: Docker file name
 ## -t :: Docker image name - tagging our image



## running docker image

 # docker run -p 8085:8085 docker-spring-boot

