# OpenJDK 베이스 이미지를 사용합니다.
FROM openjdk:21-jdk-slim

# 애플리케이션의 JAR 파일 이름을 정의합니다.
ARG JAR_FILE=build/libs/*.jar

# JAR 파일을 이미지 내부로 복사합니다.
COPY ${JAR_FILE} app.jar

# 컨테이너가 시작될 때 애플리케이션을 실행합니다.
ENTRYPOINT ["java", "-jar", "/app.jar"]
