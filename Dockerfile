FROM openjdk:11
COPY target/danielgirardiweb-1.0.jar /app/danielgirardiweb-1.0.jar
WORKDIR /app
ENTRYPOINT ["java", "-jar", "danielgirardiweb-1.0.jar"]