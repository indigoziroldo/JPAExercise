package br.edu.fema.modelo.atividadesfixacao.domain.local.entity;

import br.edu.fema.modelo.atividadesfixacao.domain.churrasco.entity.Churrasco;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;

@Data

@Entity
@Table(name = "local")
public class Local {

    // ID
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Setter(AccessLevel.NONE)
    private UUID id;

    //    vagas_estacionamento INTEGER,
    @Column(name = "vagas_estacionamento", nullable = false)
    private int vagasEstacionamento;

    //    limite_de_pessoas INTEGER,
    @Column(name = "limite_de_pessoas", nullable = false)
    private int limiteDePessoas;

    //    valor DECIMAL(5,2),
    @Column(scale = 5, precision = 2)
    private BigDecimal valor; // pode ser null

    @Embedded
    private Endereco endereco;

    @OneToMany(mappedBy="local")
    private Set<Churrasco> churrascos;


}



