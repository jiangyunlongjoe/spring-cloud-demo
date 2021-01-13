FROM openjdk:8-jre
ADD target/consumer-1.0.jar /root/
WORKDIR /root
ENV JAVA_OPTS=" -Xms256m -Xmx256m"
EXPOSE 10010
CMD java ${JAVA_OPTS} -jar consumer-1.0.jar
