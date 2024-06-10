package br.edu.fema.modelo.atividadesfixacao.domain.churrasco.repository;

import br.edu.fema.modelo.atividadesfixacao.domain.churrasco.entity.Churrasco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChurrascoRepository extends JpaRepository<Churrasco, Integer> {
}
