FROM openjdk:8-jre
ADD target/provider-1.0.jar /root/
WORKDIR /root
ENV JAVA_OPTS=" -Xms256m -Xmx256m"
EXPOSE 9001
CMD java ${JAVA_OPTS} -jar provider-1.0.jar
