package br.edu.fema.modelo.atividadesfixacao.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Entity
public class Alimento {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    //    descricao VARCHAR(50),
    @Column(length = 50)
    private String descricao;

    //    valor DECIMAL(7,2),
    @Column(scale = 7, precision = 2)
    private BigDecimal valor;

    //    quantidade INTEGER,
    @Column
    private Integer quantidade;

    //    id_tipo_alimento INTEGER,
    @Column(name = id_tipo_alimento)
    private long


}




//    CONSTRAINT alimento_tipo_alimento_id_fk FOREIGN KEY(id_tipo_alimento) REFERENCES tipo_comes_e_bebes(id)
