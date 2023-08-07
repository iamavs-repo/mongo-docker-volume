FROM openjdk:11
ADD target/springbootnew-mongo-docker-volume.jar springbootnew-mongo-docker-volume.jar
ENTRYPOINT ["java","-jar","springbootnew-mongo-docker-volume.jar"]
