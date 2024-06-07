package br.edu.fema.modelo.atividadesfixacao.domain.entity;

import br.edu.fema.modelo.atividadesfixacao.domain.enums.Situacao;
import br.edu.fema.modelo.atividadesfixacao.domain.enums.Locomocao;
import jakarta.persistence.*;
import lombok.Data;
@Data

@Entity
@Table(name = "pessoa")
public class Pessoa {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;

        // nome VARCHAR(50),
        @Column(length = 50)
        private String nome;

        // situacao VARCHAR(20),
        @Column(length = 20)
        @Enumerated(EnumType.STRING)
        private Situacao situacao; // fazer referencia ao enum

        // telefone VARCHAR(15),
        @Column(length = 15)
        private String telefone;

        // locomocao VARCHAR(20),
        @Column(length = 20)
        @Enumerated(EnumType.STRING)
        private Locomocao locomocao; // fazer referencia ao enum

        // data_confirmacao VARCHAR(11),
        @Column(length = 11)
        private String data_confirmacao;

}


