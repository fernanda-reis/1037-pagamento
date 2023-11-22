package ada.tech.tenthirty.tvpackages.consumer;

import ada.tech.tenthirty.tvpackages.contants.RabbitMQConstantes;
import ada.tech.tenthirty.tvpackages.payloads.PagamentoRequest;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class CriarPagamentoConsumer {
    @RabbitListener(queues = RabbitMQConstantes.FILA_CRIAR_PAGAMENTO)
    private void consumidor(PagamentoRequest pagamentoRequest){
        System.out.println(pagamentoRequest.faturaId);
        System.out.println(pagamentoRequest.valor);
        System.out.println(pagamentoRequest.status);
    }
}
