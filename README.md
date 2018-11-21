# thor
Repository for thor service.

#### Build the service image with command

docker build -t ecs-workshop/thor --build-arg JAR_FILE=target/thor-1.0-SNAPSHOT.jar .

#### Run the image with command

docker run -p 8080:8080 ecs-workshop/thor