<h1 align="center">
  <img src="./doc/place.png" width=256 alt="place-service">
  <br />
  Place Service
</h1>

<p align="center"><i>"Api para criação de lugares"</i></p>

<p align="center">

  <a href="https://github.com/RafaelFantinel/place-service/fork">
    <img height=26 alt="Crie um fork no github" src="https://img.shields.io/badge/Fork--Me-H?style=social&logo=github">
  </a>
  <img  height=26 alt="GitHub Repo stars" src="https://img.shields.io/github/stars/RafaelFantinel/place-service?style=social">

</p>

# O que é?

Place Service é uma API para cadastro de lugares, que foi construída utilizando WebFlux, sendo possível realizar uma requisição HTTP POST informando no corpo da requisição os parâmetros "name" e "state", ao final a informação é inserida no banco de dados e é retornado na resposta HTTP a data de criação, data da ultima atualização e um SLUG unico.

# 🚀 Tecnologias utilizadas

Este projeto usa as seguintes tecnologias:

- [Temurin Open-JDK 17](https://adoptium.net/temurin/releases/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring WebFlux](https://docs.spring.io/spring-framework/reference/web/webflux.html)
- [Slugify](https://github.com/slugify/slugify)
- [Spring R2dbc](https://spring.io/guides/gs/accessing-data-r2dbc/)
- [Spring Dev tools](https://docs.spring.io/spring-boot/docs/1.5.16.RELEASE/reference/html/using-boot-devtools.html#:~:text=The%20spring%2Dboot%2Ddevtools%20module%20includes%20an%20embedded%20LiveReload%20server,and%20Safari%20from%20livereload.com.)
- [Spring Validation](https://www.baeldung.com/spring-boot-bean-validation)
- [H2 Database](https://www.h2database.com)

# Como se instala?

Clonar o repositório:

```sh
git clone https://github.com/RafaelFantinel/place-service.git
```

# Como se usa?

1. Clone o projeto
2. Rode o comando a baixo, do maven:

```sh
mvn clean install -DskipTests
```

3. rode o comando "docker-compose up"
4. A aplicação ficará disponível na porta :8080
5. Para interagir:
  Realize uma requisição HTTP para o endereço localhost:8080, com o body preenchido, exemplo:

```json
{
  "name": "Name test",
  "state": "State"
}

```

# Resposta da API

```json
{
  "name": "Name test",
  "slug": "name-test",
  "state": "State",
  "createdAt": "2023-09-06T09:30:55.582104162",
  "updatedAt": "2023-09-06T09:30:55.582104162"
}

```

# Rodando os testes

Execute o comando:

```sh
mvn test
```

# O que está faltando fazer?

- [x] Criar endpoint para criação de lugares
- [x] Criar implementação para geração de SLUG
- [ ] Criar endpoint para atualização do lugar
- [ ] Criar endpoint que busca todos os lugares cadastrados
- [ ] Criar endpoint GET que busca lugar por SLUG
