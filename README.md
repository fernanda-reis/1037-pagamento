# Microserviço de Pagamento

Este repositório contém o código fonte para um sistema de microserviço de Pagamento, integrado com Fatura e outros serviços relacionados.

## Visão Geral do Projeto

### Descrição Breve
O microserviço de pagamento é parte de um sistema distribuído que gerencia transações de pagamento para faturas. Ele se comunica com outros microserviços de forma assíncrona e via REST API para realizar operações de criação, consulta e retorno de pendências de pagamento.

### Arquitetura
O projeto é baseado em uma arquitetura de microsserviços, onde a comunicação entre Fatura e Pagamento é realizada por meio de mensagens assíncronas (fila CRIAR_PAGAMENTO) e integrações REST para consulta de pagamentos.

## Configuração do Ambiente de Desenvolvimento

### Requisitos
- Java 17
- Maven
- Banco de Dados H2 (ou PostgreSQL)
- RabbitMQ (para mensagens assíncronas)

### Instruções de Configuração
1. Clone o repositório.
2. Configure as dependências e o ambiente Java.
3. Configure o banco de dados e o RabbitMQ conforme necessário.

## Componentes

### 1. Criar Pagamento
O microserviço de Fatura envia uma requisição assíncrona para cadastrar um novo pagamento com os seguintes dados:

```json
{ 
     "faturaId": "string",
     "usuarioId": "string",
     "valor": "BigDecimal", 
     "dataVencimento": "string (formato yyyy-mm-dd)"
}

Nome da Fila: CRIAR_PAGAMENTO

### 2. Consultar Pagamento
O microserviço de Pagamento oferece um endpoint REST para consultar pagamentos associados a um usuário:

Endpoint: GET /pagamento/<UsuarioId>

### 3. Retorna Pendencia 
O serviço de Pagamento retorna pendências para outros serviços como Assinatura e Visita Técnica. A resposta contém informações sobre faturas pendentes:

[ 
  { 
     "faturaId": string, 
     "dataVencimento": string (formato yyyy-mm-dd)
  }
]

### Contrato de Comunicação
![f6f36058-1646-4b78-9246-412dfd9b5e18](https://github.com/fernanda-reis/1037-pagamento/assets/116811743/e6991c83-5286-4c99-b79f-fc388a13c504)
![d5838e46-e854-4e73-8f6a-01d7df1727e5](https://github.com/fernanda-reis/1037-pagamento/assets/116811743/07d177f3-e75e-4142-9658-b4564f9ae848)

## Contribuição

- Beatriz Berto
- Bruna Torres
- Fernanda Soares
- Jessica Alves
- Jessica Lima
- Luciana Oliveira

