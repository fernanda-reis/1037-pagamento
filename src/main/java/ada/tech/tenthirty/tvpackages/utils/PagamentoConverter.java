package ada.tech.tenthirty.tvpackages.utils;

import ada.tech.tenthirty.tvpackages.entity.Pagamento;
import ada.tech.tenthirty.tvpackages.payloads.PagamentoRequest;
import ada.tech.tenthirty.tvpackages.payloads.PagamentoResponse;

public class PagamentoConverter {

    public static Pagamento toEntity(PagamentoRequest pagamentoRequest) {
        Pagamento pagamento = new Pagamento();
        pagamento.setFaturaId(pagamentoRequest.getFaturaId());
        pagamento.setUsuarioId(pagamentoRequest.getUsuarioId());
        pagamento.setMetodoPagamento(pagamentoRequest.getMetodoPagamento());
        pagamento.setValor(pagamentoRequest.getValor());
        pagamento.setDataVencimento(pagamentoRequest.getDataVencimento());
        pagamento.setDataPagamento(pagamentoRequest.getDataPagamento());

        if(pagamentoRequest.getStatus() != null) {
            pagamento.setStatus(pagamentoRequest.getStatus());
        } else {
            pagamento.setStatus("Pendente");
        }

        return pagamento;
    }

    public static PagamentoResponse toResponse(Pagamento pagamento) {
        PagamentoResponse pagamentoResponse = new PagamentoResponse();
        pagamentoResponse.setFaturaId(pagamento.getFaturaId());
        pagamentoResponse.setUsuarioId(pagamento.getUsuarioId());
        pagamentoResponse.setStatus(pagamento.getStatus());
        return pagamentoResponse;
    }
}
