package ada.tech.tenthirty.tvpackages.service;

import ada.tech.tenthirty.tvpackages.entity.Pagamento;
import ada.tech.tenthirty.tvpackages.payloads.PagamentoRequest;
import ada.tech.tenthirty.tvpackages.repository.IPagamentoRepository;
import ada.tech.tenthirty.tvpackages.utils.PagamentoConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PagamentoService {

    @Autowired
    IPagamentoRepository pagamentoRepository;

    public void criarPagamento(PagamentoRequest pagamentoRequest) {
        Pagamento pagamento = PagamentoConverter.toEntity(pagamentoRequest);
        pagamentoRepository.save(pagamento);

    }



}
