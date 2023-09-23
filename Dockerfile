FROM eclipse-temurin:17
COPY target/sorry.jar sorry.jar
CMD [ "java", "-jar", "sorry.jar" ]