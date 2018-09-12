FROM java:8
VOLUME /tmp
ADD /target/nextgen-eureka-server-1.0-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
EXPOSE 8001
ENV JAVA_OPTS=""
ENTRYPOINT ["java", "-jar", "/app.jar" ]