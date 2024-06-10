package br.edu.fema.modelo.atividadesfixacao.domain.local.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Endereco {

    //    rua VARCHAR(40),
    @Column(length = 40, nullable = false)
    private String rua;

    //    numero VARCHAR(10),
    @Column(length = 10, nullable = false)
    private String numero;

    //    cep VARCHAR(9),
    @Column(length = 9, nullable = false)
    private String cep;

    //    cidade VARCHAR(30),
    @Column(length = 30, nullable = false)
    private String cidade;

    //    estado VARCHAR(30),
    @Column(length = 30, nullable = false)
    private String estado;

    //    complemento VARCHAR(30),
    @Column(length = 30)
    private String complemento; // pode ser null


}
