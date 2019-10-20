FROM openjdk
ARG version
LABEL maintainer="xqcao<xqcao@xqcao.com>"
LABEL com.docker.compose.container-name="auth-service"

COPY build/libs/auth-service-${version}.jar /usr/local/auth-service/app.jar
WORKDIR /usr/local/auth-service/

CMD ["sh", "-c", "java $JAVA_OPTS -jar app.jar" ]
