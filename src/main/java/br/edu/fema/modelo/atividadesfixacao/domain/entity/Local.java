package br.edu.fema.modelo.atividadesfixacao.domain.entity;

import br.edu.fema.modelo.atividadesfixacao.domain.enums.Locomocao;
import br.edu.fema.modelo.atividadesfixacao.domain.enums.Situacao;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data

@Entity
@Table(name = "local")
public class Local {

    // ID
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    //    vagas_estacionamento INTEGER,
    @Column(name = "vagas_estacionamento")
    private int vagasEstacionamento;

    //    limite_de_pessoas INTEGER,
    @Column(name = "limite_de_pessoas")
    private int limiteDePessoas;

    //    valor DECIMAL(5,2),
    @Column(scale = 5, precision = 2)
    private BigDecimal valor; // pode ser null

    // embbeded
    @Embedded
    private Endereco endereco;

}



