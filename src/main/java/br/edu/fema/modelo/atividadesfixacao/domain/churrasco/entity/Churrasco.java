package br.edu.fema.modelo.atividadesfixacao.domain.churrasco.entity;

import br.edu.fema.modelo.atividadesfixacao.domain.local.entity.Local;
import br.edu.fema.modelo.atividadesfixacao.domain.pessoa.entity.Pessoa;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
public class Churrasco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter(AccessLevel.NONE)
    private Integer id;

    @Column (nullable = false)
    private LocalDateTime dataInicio;

    @Column (nullable = false)
    private LocalDateTime dataFim;

    @Column(name = "id_local", nullable = false)
    private UUID idLocal;

    @Column (nullable = false)
    private Pessoa anfitriao; // msm esquema de cima

    @ManyToOne
    @JoinColumn (name = "id_local", insertable = false, updatable = false)
    private Local local;


}
