package br.edu.fema.modelo.atividadesfixacao.domain.pessoa.controller;

import br.edu.fema.modelo.atividadesfixacao.domain.pessoa.entity.Pessoa;
import br.edu.fema.modelo.atividadesfixacao.domain.pessoa.repository.PessoaRepository;
import br.edu.fema.modelo.atividadesfixacao.domain.pessoa.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @GetMapping("/todos")
    public ResponseEntity getAllSalaries() {
        List<Pessoa> salaries = pessoaService.findAllPessoas();
        return new ResponseEntity<>(salaries, HttpStatus.OK);
    }







//    @Autowired
//    private PessoaRepository pessoaRepository;
//
//    @Autowired
//    private PessoaService pessoaService;
//
//    @GetMapping("/buscaPessoas")
//    public List<Pessoa> findAll() {
//        return pessoaRepository.findAll();
//    }
//
//    @GetMapping(value = "buscaPorData/{data}")
//    public ResponseEntity<Pessoa> findByData(@PathVariable String data) {
//        Optional<Pessoa> pessoa = pessoaRepository.findByData(data);
//
//        if (pessoa.isPresent()) {
//            return ResponseEntity.ok(pessoa.get());
//        }
//        return ResponseEntity.notFound().build();
//
//    }

}
