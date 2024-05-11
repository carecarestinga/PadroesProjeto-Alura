package alura.carecarestinga.loja.orcamento.situacao;

import java.math.BigDecimal;

import alura.carecarestinga.loja.DomainException;
import alura.carecarestinga.loja.orcamento.Orcamento;

public class Finalizado extends SituacaoOrcamento {

	@Override
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		throw new DomainException("Orcamento finalizado nao pode ter desconto extra!");
	}

}
