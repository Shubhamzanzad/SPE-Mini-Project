# Use Ubuntu Image
FROM ubuntu:latest
# Set working directory
WORKDIR /app
# update package list anf install java
RUN apt-get update && \
apt-get install -y openjdk-17-jdk

COPY . /app
RUN javac scientificCalculator.java

CMD ["java","scientificCalculator" ]
