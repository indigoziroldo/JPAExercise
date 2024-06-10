package br.edu.fema.modelo.atividadesfixacao.domain.alimento.repository;

import br.edu.fema.modelo.atividadesfixacao.domain.alimento.entity.TipoAlimento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoAlimentoRepository extends JpaRepository<TipoAlimento, Integer> {

}
