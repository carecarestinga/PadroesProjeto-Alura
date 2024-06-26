package alura.carecarestinga.loja.orcamento.situacao;

import java.math.BigDecimal;

import alura.carecarestinga.loja.DomainException;
import alura.carecarestinga.loja.orcamento.Orcamento;

public abstract class SituacaoOrcamento {

	public abstract BigDecimal calcularDescontoExtra(Orcamento orcamento);
	
	public void aprovar(Orcamento orcamento) throws DomainException {
		throw new DomainException("Orcamento nao pode ser aprovado!");
	}
	
	public void reprovar(Orcamento orcamento) throws DomainException {
		throw new DomainException("Orcamento nao pode ser reprovado!");
	}
	
	public void finalizar(Orcamento orcamento) throws DomainException {
		throw new DomainException("Orcamento nao pode ser finalizado!");
	}

}
