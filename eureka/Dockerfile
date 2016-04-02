FROM java:8-jdk

MAINTAINER Dejan Angelevski

ENV NEXUS_ARTIFACT http://dockerizedci_nexus_1:8081/nexus/service/local/artifact/maven/redirect?r=snapshots&g=com.spring.netflix.showcase&a=eureka&v=&0.0.1-SNAPSHOT&p=jar

RUN apt-get update -y && \
  apt-get install wget -y && \
  wget -O ~/eureka.jar ${NEXUS_ARTIFACT}
  
RUN java -jar ~/eureka.jar
