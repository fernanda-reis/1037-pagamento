# Microserviço de Pagamento

Este projeto é um microserviço de pagamento desenvolvido com Spring e Maven, permitindo comunicação assíncrona entre os microsserviços de Fatura e Pagamento.

## Visão Geral do Projeto

### Descrição Breve
O microserviço de pagamento permite o cadastro e consulta de pagamentos associados a faturas, utilizando comunicação assíncrona entre os microsserviços de Fatura e Pagamento.

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

## API e Documentação

### Endpoints da API
- **POST /pagamento/criar**: Cria um novo pagamento a partir de uma fatura.

### Contrato de Comunicação
![f6f36058-1646-4b78-9246-412dfd9b5e18](https://github.com/fernanda-reis/1037-pagamento/assets/116811743/e6991c83-5286-4c99-b79f-fc388a13c504)
![d5838e46-e854-4e73-8f6a-01d7df1727e5](https://github.com/fernanda-reis/1037-pagamento/assets/116811743/07d177f3-e75e-4142-9658-b4564f9ae848)
