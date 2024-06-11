package br.edu.fema.modelo.atividadesfixacao.domain.alimento.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;


@Getter
@Setter @NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "comes_e_bebes")
public class Alimento {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Setter(AccessLevel.NONE)
    private UUID id;

    //    descricao VARCHAR(50),
    @Column
    private String descricao;

    //    valor DECIMAL(7,2),
    @Column
    private BigDecimal valor;

    @OneToMany(mappedBy = "comes_e_bebes")
    private List<TipoAlimento> tipoAlimento;

}




//    CONSTRAINT alimento_tipo_alimento_id_fk FOREIGN KEY(id_tipo_alimento) REFERENCES tipo_comes_e_bebes(id)
