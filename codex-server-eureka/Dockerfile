FROM daocloud.io/library/java:openjdk-8-jre-alpine
MAINTAINER XuXi<xuxi@wondersgroup.com>

VOLUME /tmp
COPY ./build/libs/codex-server-eureka-1.0.0.jar /app.jar
ENTRYPOINT [ "java", "-jar" , "/app.jar" ]

EXPOSE 8200 8201