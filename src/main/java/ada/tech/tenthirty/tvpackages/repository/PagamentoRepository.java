package ada.tech.tenthirty.tvpackages.repository;

import ada.tech.tenthirty.tvpackages.entidades.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
}
