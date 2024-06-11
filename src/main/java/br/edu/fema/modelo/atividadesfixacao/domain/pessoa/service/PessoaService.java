package br.edu.fema.modelo.atividadesfixacao.domain.pessoa.service;

import br.edu.fema.modelo.atividadesfixacao.domain.pessoa.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;


}
