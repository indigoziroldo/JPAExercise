package br.edu.fema.modelo.atividadesfixacao.domain.local.entity;

import br.edu.fema.modelo.atividadesfixacao.domain.churrasco.entity.Churrasco;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor


@Entity
@Table(name = "local")
public class Local {

    // ID
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Setter(AccessLevel.NONE)
    private UUID id;

    //    vagas_estacionamento INTEGER,
    @Column(name = "vagas_estacionamento")
    private int vagasEstacionamento;

    //    limite_de_pessoas INTEGER,
    @Column(name = "limite_de_pessoas")
    private int limiteDePessoas;

    //    valor DECIMAL(5,2),
    @Column
    private BigDecimal valor; // pode ser null

    @Embedded
    private Endereco endereco;

    @ManyToOne
    @JoinColumn(name = "id_churrasco")
    private Churrasco churrasco;

}



