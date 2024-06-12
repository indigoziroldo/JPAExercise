package br.edu.fema.modelo.atividadesfixacao.domain.pessoa.service;

import br.edu.fema.modelo.atividadesfixacao.domain.pessoa.entity.Pessoa;
import br.edu.fema.modelo.atividadesfixacao.domain.pessoa.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PessoaService {

    List<Pessoa> findAllPessoas();


}
