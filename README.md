# Private Banking Records API

A Java / Spring Boot REST application for managing information about private banks. Developed as an early project during my QazPost internship.

[Author profile](https://github.com/jigduman) · [All projects](https://github.com/jigduman/jigduman/blob/main/PROJECTS.md)

## Scope

Create, retrieve, update, and delete bank records, including fields such as net worth, minimum deposit requirements, and descriptions. This project is a bank-information API, not a live banking or transaction-processing system.

## Stack

Java 21, Spring Boot 3.3.1, Spring Web, Spring Data JPA, PostgreSQL, Maven, Spring Cloud Eureka client, and a Springdoc OpenAPI dependency.

## Repository guide

The application lives in `privatebanking/`:

| Directory | Purpose |
| --- | --- |
| `src/main/java/com/privateBanking/crud/controller/` | HTTP controllers |
| `src/main/java/com/privateBanking/crud/entity/` | Record definitions |
| `src/main/java/com/privateBanking/crud/repository/` | Persistence |
| `src/main/java/com/privateBanking/crud/services/` | CRUD logic |
| `src/main/resources/` | Application configuration |

## Local setup

1. Install JDK 21, Maven, and PostgreSQL.
2. Configure a local database in `privatebanking/src/main/resources/application.yml`.
3. Review Eureka settings for your environment.
4. Run from the application directory:

```bash
cd privatebanking
mvn spring-boot:run
```

Run existing tests with `mvn test` after configuring their required services. This repository retains its original learning implementation; use synthetic data when experimenting.
