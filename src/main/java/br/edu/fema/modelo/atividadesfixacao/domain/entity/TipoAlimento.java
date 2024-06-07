package br.edu.fema.modelo.atividadesfixacao.domain.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tipo_comes_e_bebes")
public class TipoAlimento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(length = 20)
    private String descricao;
}
