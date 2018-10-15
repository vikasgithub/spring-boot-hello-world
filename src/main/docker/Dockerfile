FROM openjdk:8-jdk-alpine
RUN mkdir -p /usr/local/helloworld
ADD @project.build.finalName@.jar /usr/local/helloworld/
WORKDIR /usr/local/helloworld/
ENTRYPOINT java -jar demo-0.0.1-SNAPSHOT.jar

