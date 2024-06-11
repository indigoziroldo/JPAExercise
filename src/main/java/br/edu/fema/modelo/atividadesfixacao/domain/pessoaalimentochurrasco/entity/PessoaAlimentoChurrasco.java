package br.edu.fema.modelo.atividadesfixacao.domain.pessoaalimentochurrasco.entity;

import br.edu.fema.modelo.atividadesfixacao.domain.churrasco.entity.Churrasco;
import br.edu.fema.modelo.atividadesfixacao.domain.pessoa.entity.Pessoa;
import br.edu.fema.modelo.atividadesfixacao.domain.alimento.entity.Alimento;
import jakarta.persistence.*;

@Entity
@Table(name = "pessoa_alimento_xhurrasco", schema = "public")
public class PessoaAlimentoChurrasco {

    @EmbeddedId
    private PessoaAlimentoChurrascoId id;

    //    quantidade INTEGER,
    @Column
    private Integer quantidade;

    @ManyToOne
    @MapsId("idPessoa")
    @JoinColumn(name = "id_pessoa")
    private Pessoa pessoa;

    @ManyToOne
    @MapsId("idAlimento")
    @JoinColumn(name = "id_alimento")
    private Alimento alimento;

    @ManyToOne
    @MapsId("idChurrasco")
    @JoinColumn(name = "id_xhurrasco")
    private Churrasco churrasco;
}
