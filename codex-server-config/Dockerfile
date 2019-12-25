FROM daocloud.io/library/java:openjdk-8-jre-alpine
MAINTAINER XuXi<xuxi5034241849@vip.qq.com>

VOLUME /tmp
COPY ./build/libs/codex-server-config-1.0.0.jar /app.jar
ENTRYPOINT [ "java", "-jar", "/app.jar" ]

EXPOSE 8100 8101