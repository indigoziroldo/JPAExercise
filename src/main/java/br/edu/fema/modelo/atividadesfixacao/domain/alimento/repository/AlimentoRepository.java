package br.edu.fema.modelo.atividadesfixacao.domain.alimento.repository;

import br.edu.fema.modelo.atividadesfixacao.domain.alimento.entity.Alimento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface AlimentoRepository extends JpaRepository<Alimento, UUID> {

}
