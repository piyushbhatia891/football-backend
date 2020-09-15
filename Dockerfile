ARG FROM_TAG=12
FROM openjdk:$FROM_TAG

RUN yum -y update && yum -y clean-all
RUN mkdir -p /app
ENV APP_HOME /app

USER java
EXPOSE 8080 9090
COPY target/*.jar $APP_HOME/app.jar
ENTRYPOINT ["entrypoint.sh"]
CMD java $JAVA_OPTS -jar $APP_HOME/app.jar 