from openjdk:17
expose 8081
add target/producer-0.0.1-SNAPSHOT.jar producer.jar
entrypoint ["java" , "-jar" , "/producer.jar"]

