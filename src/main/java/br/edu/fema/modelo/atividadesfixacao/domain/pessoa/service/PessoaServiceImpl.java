package br.edu.fema.modelo.atividadesfixacao.domain.pessoa.service;

import br.edu.fema.modelo.atividadesfixacao.domain.pessoa.entity.Pessoa;
import br.edu.fema.modelo.atividadesfixacao.domain.pessoa.repository.PessoaRepository;

import java.util.List;

public class PessoaServiceImpl implements PessoaService{

    private final PessoaRepository pessoaRepository;

    public PessoaServiceImpl(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public List<Pessoa> findAllPessoas() {
        return pessoaRepository.findAll();
    }
}
