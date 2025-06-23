# Этап 1: сборка проекта
FROM maven:3.9.9-eclipse-temurin-21 AS builder
WORKDIR /app
COPY . .
RUN mvn install -DskipTests

# Этап 2: минимальный финальный образ
FROM eclipse-temurin:21-jdk-jammy
WORKDIR /app
COPY --from=builder /app/target/main.jar .
CMD ["java", "-jar", "main.jar"]