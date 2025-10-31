FROM fedora:29

RUN dnf install -y java-11-openjdk maven git-all && dnf clean all

WORKDIR /app

COPY . .

CMD ["mvn", "test"]