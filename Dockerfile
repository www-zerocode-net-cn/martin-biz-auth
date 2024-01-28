FROM erdonline/jdk8-yum-go:latest

MAINTAINER martin114@foxmail.com

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime

RUN mkdir -p /martin-biz-auth && mkdir -p /opt/erd

WORKDIR /martin-biz-auth

EXPOSE 9400

ADD ./target/martin-biz-auth.xjar ./

ADD ./target/xjar.go ./

RUN go version

RUN go build xjar.go

ENTRYPOINT ./xjar java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -jar martin-biz-auth.xjar
