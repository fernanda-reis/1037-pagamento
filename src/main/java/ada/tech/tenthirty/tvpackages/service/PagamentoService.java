package ada.tech.tenthirty.tvpackages.service;

import ada.tech.tenthirty.tvpackages.entity.Pagamento;
import ada.tech.tenthirty.tvpackages.payloads.PagamentoRequest;
import ada.tech.tenthirty.tvpackages.payloads.PagamentoResponse;
import ada.tech.tenthirty.tvpackages.repository.IPagamentoRepository;
import ada.tech.tenthirty.tvpackages.utils.PagamentoConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class PagamentoService {

    @Autowired
    IPagamentoRepository pagamentoRepository;

    public void criarPagamento(PagamentoRequest pagamentoRequest){
        Pagamento pagamento = PagamentoConverter.toEntity(pagamentoRequest);
        pagamentoRepository.save(pagamento);

    }

    public PagamentoResponse efetuarPagamento(Long id, PagamentoRequest pagamentoRequest) {
        Optional<Pagamento> pagamentoEncontrado = pagamentoRepository.findById(id);
        if (pagamentoEncontrado.isEmpty()) {
            throw new RuntimeException("Pagamento não encontrado");
        } else {
            Pagamento pagamento = pagamentoEncontrado.get();
            pagamento.setDataPagamento(new Date());
            pagamento.setMetodoPagamento(pagamentoRequest.getMetodoPagamento());
            pagamento.setStatus("Pago");
            return PagamentoConverter.toResponse(pagamentoRepository.save(pagamento));
        }
    }


        public PagamentoResponse consultarUsuario(String usuarioId) {
            Pagamento pagamento = pagamentoRepository.findByUsuarioId(usuarioId);

            if (pagamento != null) {
                return PagamentoConverter.toResponse(pagamento);
            } else {
                return null;
            }
        }

    public PagamentoResponse atualizarPagamento(Long id, PagamentoRequest pagamentoRequest) {
        Optional<Pagamento> pagamentoEncontrado = pagamentoRepository.findById(id);
        if (pagamentoEncontrado.isPresent()) {
            Pagamento pagamento = pagamentoEncontrado.get();
            pagamento.setMetodoPagamento(pagamentoRequest.getMetodoPagamento());
            pagamento.setStatus(pagamentoRequest.getStatus());
            // Atualize outros campos conforme necessário

            Pagamento pagamentoAtualizado = pagamentoRepository.save(pagamento);
            return PagamentoConverter.toResponse(pagamentoAtualizado);
        } else {
            return null; // Ou lança uma exceção ou retorna um objeto vazio para indicar que o pagamento não foi encontrado
        }
    }

}
