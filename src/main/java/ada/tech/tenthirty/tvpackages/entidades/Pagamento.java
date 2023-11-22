package ada.tech.tenthirty.tvpackages.entidades;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@Table(name = "pagamento")
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fatura_id", nullable = false)
    private String faturaId;

    @Column(name = "metodo_pagamento")
    private String metodoPagamento;

    @Column(name = "valor")
    private BigDecimal valor;

    @Column(name = "data_vencimento")
    private Date dataVencimento;

    @Column(name = "data_pagamento")
    private Date dataPagamento;

    @Column(name = "status")
    private String status;

}