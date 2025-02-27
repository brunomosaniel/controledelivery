# Controle Delivery
Este projeto foi desenvolvido com o objetivo de gerenciar e controlar as operações de um serviço de delivery para restaurante.

## Índice

- [Tecnologias](#tecnologias)
- [Pré-requisitos](#pré-requisitos)
- [Instalação](#instalação)
- [Uso](#uso)
- [Contribuição](#contribuição)

  ## Tecnologias

Este projeto foi desenvolvido utilizando as seguintes tecnologias:

- Java 17
- Spring Boot
- Spring Data JPA
- Banco de dados ( H2)
- Maven
- outros (ex: Swagger, Lombok, etc.)
## Pré-requisitos

Antes de começar, verifique se você tem os seguintes softwares instalados:

- JDK 17 ou superior
- Maven 
- Banco de Dados configurado

## Instalação

Siga os passos abaixo para configurar o ambiente de desenvolvimento:

1. Clone o repositório:
   ```bash
   git clone https://github.com/brunomosaniel/controleDelivery.git
2. Configure o banco de dados em application.yml.
3. Compile o projeto: mvn clean install
4. Execute a aplicação: mvn spring-boot:run

## Uso
  
  ### API Cliente
  ```
 criar um novo cliente (POST)
 curl -X POST http:localhost:8080/controledelivery/api/v1/cliente
 
 lista todos os Clientes (GET)
 curl -X GET http:localhost:8080/controledelivery/api/v1/cliente

 busca por usuário (GET)
curl -X GET http:localhost:8080/controledelivery/api/v1/cliente/{idCliente}

 deleta o cliente
 curl -X DEL http:localhost:8080/controledelivery/api/v1/cliente/{idCliente}

 altera o Cliente
curl -X PATCH http:localhost:8080/controledelivery/api/v1/cliente/{idCliente}
```
### API Pedido
 ```
 criar um novo Pedido (POST)
 curl -X POST http:localhost:8080/controledelivery/api/v1/cliente/{idCliente}/pedido

 lista todos os Pedidos (GET)
 curl -X GET http:localhost:8080/controledelivery/api/v1/cliente/{idCliente}/pedido

 busca por Pedido (GET)
 curl -X GET http:localhost:localhost:8080/controledelivery/api/v1/cliente/{idCliente}/pedido/{idPedido}

deleta o Pedido
 curl -X DEL http:localhost:8080/controledelivery/api/v1/cliente/{idCliente}/pedido/{idPedido}

altera o Pedido
curl -X PATCH http:localhost:8080/controledelivery/api/v1/cliente/{idCliente}/pedido/{idPedido}
```
### API Entrega
```
 criar uma Entrega (POST)
 curl -X POST http:localhost:8080/controledelivery/api/v1/pedido/{idPedido}/entrega

 lista todos os Entregas (GET)
  curl -X GET http:localhost:8080/controledelivery/api/v1/pedido/{idPedido}/entrega

 busca por Entrega (GET)
 curl -X GET http:localhost:8080/controledelivery/api/v1/pedido/{idPedido}/entrega/{idEntrega}

deleta o Entrega
 curl -X DEL http:localhost:8080/controledelivery/api/v1/pedido/{idPedido}/entrega/{idEntrega}

altera o Entrega
curl -X PATCH http:localhost:8080/controledelivery/api/v1/pedido/{idPedido}/entrega/{idEntrega}
```

## Contribuição

 Se você quiser contribuir, siga estas etapas:
1. Fork o projeto.
2. Crie uma nova branch (git checkout -b minha-feature).
3. Faça suas alterações e commit (git commit -m 'Adiciona nova feature').
4. Push a branch (git push origin minha-feature).
5. Crie um novo Pull Request.
 
