FROM java:8
VOLUME /tmp
ADD /target/nextgen-book-service-1.0-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "/app.jar" ]