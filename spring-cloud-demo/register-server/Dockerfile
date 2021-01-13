FROM openjdk:8-jre
ADD target/register-server-1.0.jar /root/
WORKDIR /root
ENV JAVA_OPTS=" -Xms256m -Xmx256m"
EXPOSE 8800
CMD java ${JAVA_OPTS} -jar register-server-1.0.jar
