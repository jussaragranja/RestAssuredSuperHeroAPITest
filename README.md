<h1 align="center">RestAssuredSuperHeroAPITest 👋</h1>
<p>
  <img alt="Version" src="https://img.shields.io/badge/version-2.0.0-blue.svg?cacheSeconds=2592000" />
  <a href="https://superheroapi.com/" target="_blank">
    <img alt="Documentation" src="https://img.shields.io/badge/documentation-yes-brightgreen.svg" />
  </a>
  <a href="https://github.com/jussaragranja/RestAssuredSuperHeroAPITest/actions" target="_blank">
    <img alt="Java CI with Maven" src="https://github.com/jussaragranja/RestAssuredSuperHeroAPITest/actions/workflows/ci.yml/badge.svg" />
  </a>
</p>

> Este projeto é uma demonstração prática de automação de testes de API REST utilizando **Java**, **Rest-Assured** e **JUnit 5**.  
O objetivo é ajudar iniciantes a entenderem como estruturar, implementar e executar testes automatizados em APIs REST, seguindo boas práticas de organização, clean code e integração contínua.

Os testes são realizados sobre a [SuperHeroAPI](https://superheroapi.com/), uma API pública para consulta de informações sobre super-heróis.

---

## O que você encontra neste projeto?

- Estrutura de projeto recomendada para automação de testes Java
- Exemplo de uso do Rest-Assured para requisições HTTP e validações
- Testes automatizados com JUnit 5
- Validação de contratos com JSON Schema Validator
- Uso do padrão Builder com Lombok para modelagem de dados
- Integração contínua com GitHub Actions e GitLab CI
- Exemplo de Dockerfile para execução em container

---

## Pré-requisitos

Antes de rodar o projeto, certifique-se de ter instalado:

- [Java JDK 11+](https://adoptium.net/)
- [Maven 3+](https://maven.apache.org/)
- [Git](https://git-scm.com/) (opcional, para clonar o repositório)
- [Docker](https://www.docker.com/) (opcional, para rodar em container)

---

---

## Como executar os testes

### 1. Clonando o repositório

```
sh git clone https://github.com/jussaragranja/RestAssuredSuperHeroAPITest.git
cd RestAssuredSuperHeroAPITest
```

### 2. Executando localmente (Maven)

```bash
mvn clean test
```

Os relatórios de teste e cobertura serão gerados na pasta target/.


### 3. Executando via Docker

```bash
docker build -t superhero-test .
docker run --rm superhero-test
```

### 4. Integração Contínua

O projeto já está pronto para rodar em pipelines do GitHub Actions e GitLab CI.

Ao fazer push ou pull request, os testes serão executados automaticamente.


## Feito por

👤 **Jussara Granja**

* LinkedIn: [@jussaragranja](https://linkedin.com/in/jussaragranja)
* Github: [@jussaragranja](https://github.com/jussaragranja)
