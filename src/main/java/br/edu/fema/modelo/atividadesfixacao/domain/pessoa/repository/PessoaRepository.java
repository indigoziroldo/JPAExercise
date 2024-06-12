package br.edu.fema.modelo.atividadesfixacao.domain.pessoa.repository;

import br.edu.fema.modelo.atividadesfixacao.domain.pessoa.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, UUID> {

    List<Pessoa> findTodasBynome(String nome);

    Optional<Pessoa> findByData (String dataConfirmacao);

    List<Pessoa> findAllPessoas();

}
