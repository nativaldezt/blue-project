# blue-project
This is a basic demo application built with Java Spring Boot and Docker. 
It provides a starting point for developing Spring Boot applications and running 
them in a Docker environment. It includes swagger API documentation.
*(in progress...)*

## Prerequisites

Before running the application, make sure you have the following dependencies installed on your machine:

- Java Development Kit (JDK)
- Maven
- Docker
- Docker Compose

## Getting Started

To start the application, follow these steps:

1. Build the application using Maven and skip running tests:
   ```shell
   mvn clean package -DskipTests

2. Copy the jar file to the docker directory:
   ```shell
   cp target/blue-project-0.0.1-SNAPSHOT.jar docker

3. Go to the docker directory and start the container:
    ```shell
   cd docker
   docker-compose up # use -d to run on detached mode

4. To stop the container do control + c (if not on detached mode)
5. To delete the containers run:
    ```shell
   docker-compose down

## Swagger
http://localhost:8083/swagger-ui/index.html

## Didatic content
* If you do changes you have to delete the image to see the changes. To do this you can go to the docker dashboard. Or you can do it by command line:
   ```shell
   docker images
   docker rm [ids…]
* If your maven doesn't have java 17 it will give you an error when trying to deploy. Always make sure you compile the app with the same java version as your docker image. 
The java version of the image is in the first line of the Dockerfile.