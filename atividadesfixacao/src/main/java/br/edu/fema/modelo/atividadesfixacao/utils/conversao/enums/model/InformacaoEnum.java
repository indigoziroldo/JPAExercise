package br.edu.fema.modelo.atividadesfixacao.utils.conversao.enums.model;


import br.edu.fema.modelo.atividadesfixacao.utils.conversao.enums.interfaces.GettersEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class InformacaoEnum {

	private Object valor;
	private String descricao;
}
