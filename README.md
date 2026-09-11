# FinanceFlow — Java Full Stack Tracker

Full-stack application built with Java 21, Spring Boot, PostgreSQL, Flyway and React.

## Highlights
- REST API with validation and centralized error handling
- PostgreSQL and Flyway migrations
- OpenAPI/Swagger documentation
- Actuator health and metrics
- GitHub Actions CI for backend and frontend
- Docker-ready backend
- Dashboard-oriented React UI

## Architecture
React → REST API → service layer → Spring Data JPA → PostgreSQL

## Local development
Start PostgreSQL with the supplied configuration, run the backend from `backend`, then run `npm install && npm run dev` from `frontend`.

API: `http://localhost:8082`
Swagger: `http://localhost:8082/swagger-ui.html`
