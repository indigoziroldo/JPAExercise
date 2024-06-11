package br.edu.fema.modelo.atividadesfixacao.domain.pessoaalimentochurrasco.controller;

import br.edu.fema.modelo.atividadesfixacao.domain.churrasco.entity.Churrasco;
import jdk.jfr.Category;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PessoaAlimentoChurrascoController {


    @RequestMapping(
            value = {"/procurePorUmaData/{data}", "/procurePorDuasDatas/{data}"},
            method = RequestMethod.GET,
            consumes = {"application/json", "application/xml"},
            produces = {"application/json", "application/xml"}
    )
    @ResponseBody
    public String testeChurrasco (
            @PathVariable("data") String dataChurrasco,
            @RequestBody Churrasco Churrasco
    ){
        return String.format("A data é: %s", dataChurrasco);
    }



}
