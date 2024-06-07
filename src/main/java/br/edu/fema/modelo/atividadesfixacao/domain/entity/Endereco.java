package br.edu.fema.modelo.atividadesfixacao.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.Data;

@Data

@Embeddable
public class Endereco {

    //    rua VARCHAR(40),
    @Column(length = 40)
    private String rua;

    //    numero VARCHAR(10),
    @Column(length = 10)
    private String numero;

    //    cep VARCHAR(9),
    @Column(length = 9)
    private String cep;

    //    cidade VARCHAR(30),
    @Column(length = 30)
    private String cidade;

    //    estado VARCHAR(30),
    @Column(length = 30)
    private String estado;

    //    complemento VARCHAR(30),
    @Column(length = 30)
    private String complemento; // pode ser null


}
