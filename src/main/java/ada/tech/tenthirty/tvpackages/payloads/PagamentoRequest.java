package ada.tech.tenthirty.tvpackages.payloads;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Getter
public class PagamentoRequest implements Serializable {
    public String faturaId;
    public String usuarioId;
    public String metodoPagamento;
    public BigDecimal valor;
    public Date dataVencimento;
    public Date dataPagamento;
    public String status;

    public PagamentoRequest(String faturaId, String usuarioId, BigDecimal valor, Date dataVencimento){
        this.faturaId = faturaId;
        this.usuarioId = usuarioId;
        this.valor = valor;
        this.dataVencimento = dataVencimento;

        this.metodoPagamento = null;
        this.dataPagamento = null;
        this.status = "Pendente";
    }
}
