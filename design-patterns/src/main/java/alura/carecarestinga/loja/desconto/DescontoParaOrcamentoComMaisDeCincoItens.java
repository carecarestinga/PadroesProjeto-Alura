package alura.carecarestinga.loja.desconto;

import java.math.BigDecimal;

import alura.carecarestinga.loja.orcamento.Orcamento;

public class DescontoParaOrcamentoComMaisDeCincoItens extends alura.carecarestinga.loja.desconto.Desconto {

	public DescontoParaOrcamentoComMaisDeCincoItens(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getQuantidadeItens() > 5;
	}

}
