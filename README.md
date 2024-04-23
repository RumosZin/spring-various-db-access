# Various way of Spring Database Access

스프링에서 데이터베이스에 접근하는 다양한 방식을 소개하는 레포지토리입니다. 

[스프링 입문 - 코드로 배우는 스프링 부트, 웹 MVC, DB 접근 기술 : 김영한](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81-%EC%9E%85%EB%AC%B8-%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8?gad_source=1&gclid=CjwKCAjwuJ2xBhA3EiwAMVjkVAscu20f3G2HTQTn7h9xuDtkt0AyxHkKUbjs4sTgiQzFGreZ4-totxoCFygQAvD_BwE) 강의의 **섹션 6. 스프링 DB 접근 기술**을 듣고 실습한 내용입니다.

## Configuration

**Spring Boot** 3.2.5

**Java** 17

**JDK** 22

**Spring Boot Library**

- spring-boot-starter-web

    - spring-boot-starter-tomcat: 톰캣/웹서버
    - spring-webmvc: 스프링 웹 MVC

- spring-boot-starter-thymeleaf: 타임리프 템플릿 엔진 (View)

- spring-boot-starter

    - spring-boot: spring-core
    - spring-boot-starter-logging : logback, slf4j

**Test Library**

- spring-boot-starter-test

    - junit : 테스트 프레임워크
    - mockito : 목 라이브러리
    - assertj : 테스트 코드 작성에 도움을 주는 라이브러리
    - spring-test : 스프링 통합 테스트 지원