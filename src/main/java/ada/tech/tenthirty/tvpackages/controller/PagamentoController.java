package ada.tech.tenthirty.tvpackages.controller;

import ada.tech.tenthirty.tvpackages.contants.RabbitMQConstantes;
import ada.tech.tenthirty.tvpackages.payloads.PagamentoRequest;
import ada.tech.tenthirty.tvpackages.service.PagamentoService;
import ada.tech.tenthirty.tvpackages.service.RabbitMQService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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



//        private final PagamentoService pagamentoService;
//
//        @Autowired
//        public PagamentoController(PagamentoService pagamentoService) {
//            this.pagamentoService = pagamentoService;
//        }
//
//        @PostMapping("/salvar")
//        public ResponseEntity<Pagamento> salvarPagamento(@RequestBody Pagamento pagamento) {
//            Pagamento novoPagamento = pagamentoService.salvarPagamento(pagamento);
//            return ResponseEntity.ok(novoPagamento);
//        }


}


