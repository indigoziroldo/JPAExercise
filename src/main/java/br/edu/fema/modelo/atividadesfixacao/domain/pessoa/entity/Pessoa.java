package br.edu.fema.modelo.atividadesfixacao.domain.pessoa.entity;

import br.edu.fema.modelo.atividadesfixacao.domain.pessoa.enums.Situacao;
import br.edu.fema.modelo.atividadesfixacao.domain.local.enums.Locomocao;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data

@Entity
@Table(name = "pessoa")
public class Pessoa {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Setter(AccessLevel.NONE)
        private long id;

        // nome VARCHAR(50),
        @Column(length = 50, nullable = false)
        private String nome;

        // situacao VARCHAR(20),
        @Column(length = 20, nullable = false)
        @Enumerated(EnumType.STRING)
        private Situacao situacao; // fazer referencia ao enum

        // telefone VARCHAR(15),
        @Column(length = 15, nullable = false)
        private String telefone;

        // locomocao VARCHAR(20),
        @Column(length = 20, nullable = false)
        @Enumerated(EnumType.STRING)
        private Locomocao locomocao; // fazer referencia ao enum

        // data_confirmacao VARCHAR(11),
        @Column(length = 11, nullable = false)
        private String data_confirmacao;

}


