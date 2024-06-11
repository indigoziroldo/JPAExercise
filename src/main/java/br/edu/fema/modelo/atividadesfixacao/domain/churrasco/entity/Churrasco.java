package br.edu.fema.modelo.atividadesfixacao.domain.churrasco.entity;

import br.edu.fema.modelo.atividadesfixacao.domain.local.entity.Local;
import br.edu.fema.modelo.atividadesfixacao.domain.pessoa.entity.Pessoa;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter @NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "xhurrasco")
public class Churrasco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;

    @Column
    private LocalDateTime dataInicio;

    @Column
    private LocalDateTime dataFim;

    @OneToMany(mappedBy = "local")
    private List<Local> local = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "id_pessoa")
    private Pessoa anfitriao;

}
