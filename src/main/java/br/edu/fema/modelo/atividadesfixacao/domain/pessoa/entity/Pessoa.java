package br.edu.fema.modelo.atividadesfixacao.domain.pessoa.entity;

import br.edu.fema.modelo.atividadesfixacao.domain.churrasco.entity.Churrasco;
import br.edu.fema.modelo.atividadesfixacao.domain.pessoa.enums.Situacao;
import br.edu.fema.modelo.atividadesfixacao.domain.local.enums.Locomocao;
import jakarta.persistence.*;
import lombok.*;

import java.util.Optional;

@Getter
@Setter @NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "pessoa")
public class Pessoa {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Setter(AccessLevel.NONE)
        private long id;

        // nome VARCHAR(50),
        @Column
        private String nome;

        // situacao VARCHAR(20),
        @Column
        @Enumerated(EnumType.STRING)
        private Situacao situacao; // fazer referencia ao enum

        // telefone VARCHAR(15),
        @Column
        private String telefone;

        // locomocao VARCHAR(20),
        @Column
        @Enumerated(EnumType.STRING)
        private Locomocao locomocao; // fazer referencia ao enum

        // data_confirmacao VARCHAR(11),
        @Column(name = "data_confirmacao")
        private String dataConfirmacao;

}


