FROM openjdk:8

ADD target/jenkins-practice-0.0.1-SNAPSHOT.jar DockerProject.jar

ENTRYPOINT ["java", "-jar", "DockerProject.jar"]

EXPOSE 8081


