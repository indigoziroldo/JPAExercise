package br.edu.fema.modelo.atividadesfixacao.domain.alimento.entity;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
@Entity
@Table(name = "tipo_comes_e_bebes")
public class TipoAlimento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter(AccessLevel.NONE)
    private Integer id; // ta long no Repository

    @Column(length = 20, nullable = false)
    private String descricao;
}
