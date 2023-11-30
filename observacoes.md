# Observações

## Sobre o projeto

  1. O sistema de pagamento deveria fornecer 3 entradas ao sistema

    1.1. ~~Efetuar o pagamento~~
    1.2. Consultar o pagamento
    1.3. Criar pagamento de uma fatura

  2. Entradas de sistema fornecidas - README

    1.2. Consultar Pagamento

    ### Requisição Rest (GET) com a seguinte URL


    ```bash
            http://localhost:8080/pagamento/:usuarioId

    ```


    ### Resposta

    ```json
    [ 
        { 
            "faturaId": "string", 
            "dataVencimento": "string (formato yyyy-mm-dd)"
        }
    ]   
    ```

    ## A solução proposta difere da solução implementada

        ### Requisição Rest (GET) com a seguinte URL

  ```bash
    http://localhost:8080/pagamento/consulta/:usuarioId

  ```

      1.3. Criar Pagamento de uma fatura
      
      ### Estrutura utilizando uma fila para comunicação

          Nome da fila: CRIAR_PAGAMENTO
          Estrutura da mensagem: 

          ```json
                { 
                    "faturaId": "string",
                    "usuarioId": "string",
                    "valor": "BigDecimal", 
                    "dataVencimento": "string (formato yyyy-mm-dd)"
                }
           ```
          A estrutura implementada possui mais campos que o disponibilizado. Tomar cuidado ao utilizarem o que não foi fornecido como estrutura requerida no serviço.
