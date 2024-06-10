package br.edu.fema.modelo.atividadesfixacao.domain.local.repository;

import br.edu.fema.modelo.atividadesfixacao.domain.local.entity.Local;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LocalRepository extends JpaRepository<Local, UUID> {


}
