package ada.tech.tenthirty.tvpackages.utils;

import ada.tech.tenthirty.tvpackages.entity.Pagamento;
import ada.tech.tenthirty.tvpackages.payloads.PagamentoRequest;

public class PagamentoConverter {

    public static Pagamento toEntity(PagamentoRequest pagamentoRequest) {
        Pagamento pagamento = new Pagamento();
        pagamento.setFaturaId(pagamentoRequest.getFaturaId());
        pagamento.setUsuarioId(pagamentoRequest.getUsuarioId());
        pagamento.setMetodoPagamento(pagamentoRequest.getMetodoPagamento());
        pagamento.setValor(pagamentoRequest.getValor());
        pagamento.setDataVencimento(pagamentoRequest.getDataVencimento());
        pagamento.setDataPagamento(pagamentoRequest.getDataPagamento());
        pagamento.setStatus(pagamentoRequest.getStatus());
        return pagamento;
    }
}
