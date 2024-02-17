# Use Ubuntu Image
FROM eclipse-temurin:17-jdk-jammy
# Set working directory
WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./

COPY src ./src

CMD ["./mvnw", "spring-boot:run"]