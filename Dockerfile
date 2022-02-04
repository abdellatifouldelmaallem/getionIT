FROM tomcat:9.0.58-jdk11-openjdk-slim
COPY ./target/gestionwar.war /usr/local/tomcat/webapps
CMD ["catalina.sh", "run"]
