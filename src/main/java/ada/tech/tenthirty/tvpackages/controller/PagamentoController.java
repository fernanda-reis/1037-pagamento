package ada.tech.tenthirty.tvpackages.controller;

import ada.tech.tenthirty.tvpackages.contants.RabbitMQConstantes;
import ada.tech.tenthirty.tvpackages.payloads.PagamentoRequest;
import ada.tech.tenthirty.tvpackages.service.RabbitMQService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "pagamento")
public class PagamentoController {

    @Autowired
    private RabbitMQService rabbitMQService;

    @PostMapping
    private ResponseEntity criarPagamento(@RequestBody PagamentoRequest pagamentoRequest) {
        this.rabbitMQService.enviaMensagem(RabbitMQConstantes.FILA_CRIAR_PAGAMENTO, pagamentoRequest);
        return new ResponseEntity(HttpStatus.OK);
    }
}
