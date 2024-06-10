package br.edu.fema.modelo.atividadesfixacao.domain.pessoa.repository;

import br.edu.fema.modelo.atividadesfixacao.domain.pessoa.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PessoaRepository extends JpaRepository<Pessoa, UUID> {


}
