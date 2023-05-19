FROM maven:3.8.1-openjdk-17-slim AS build
RUN mkdir /home/emp-server-app
copy . /home/emp-server-app
RUN cd /home/emp-server-app && mvn package
RUN cp /home/emp-server-app/target/*.jar emp-server-app.jar
ENTRYPOINT [ "java","-jar","emp-server-app.jar" ]
EXPOSE 8080