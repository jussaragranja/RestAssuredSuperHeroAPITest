FROM fedora:29

RUN dnf install java-11-openjdk -y

RUN dnf install maven -y

RUN dnf install git-all -y

