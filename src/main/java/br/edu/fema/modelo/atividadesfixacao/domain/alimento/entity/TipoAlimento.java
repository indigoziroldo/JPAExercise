package br.edu.fema.modelo.atividadesfixacao.domain.alimento.entity;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter @NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "tipo_comes_e_bebes")
public class TipoAlimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id; // ta long no Repository

    @Column
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "id_alimento")
    private Alimento alimento;
}
