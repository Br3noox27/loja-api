# loja-api

Backend de uma loja online: catálogo, pedido, estoque e login. Só a API, sem telas.

> **Status: em construção.** Estou aprendendo Java e Spring Boot e escrevendo este projeto passo a passo.

## O que vai ter

- [x] Spring Boot com a primeira rota `GET /produtos`
- [ ] Produtos e categorias no banco (JPA)
- [ ] Pedido: o total é calculado no servidor e o estoque nunca fica negativo
- [ ] Compra sem duplicar (chave de idempotência) e pagamento simulado com webhook
- [ ] Login com papéis (cliente e admin) usando Spring Security
- [ ] Testes (JUnit), incluindo compras simultâneas
- [ ] PostgreSQL, Docker e deploy

## Tecnologias

Java 21 · Spring Boot · Spring Data JPA · Maven · H2 (hoje) → PostgreSQL (depois)

## Como rodar

Precisa do JDK 21.

```
./mvnw spring-boot:run
```

Depois abra `http://localhost:8080/produtos`.

## Regras do projeto

- Dinheiro em centavos (número inteiro).
- O preço vem do banco, nunca do cliente.
