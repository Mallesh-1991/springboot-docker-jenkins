FROM phenompeople/openjdk17

EXPOSE 8087

WORKDIR /opt/app

ADD target/springboot-docker-jenkins.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]



