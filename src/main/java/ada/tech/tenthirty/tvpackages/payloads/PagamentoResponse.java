package ada.tech.tenthirty.tvpackages.payloads;

import lombok.Getter;
import lombok.Setter;

@Setter
public class PagamentoResponse {
    public String faturaId;
    public String usuarioId;
    public String status;
}
