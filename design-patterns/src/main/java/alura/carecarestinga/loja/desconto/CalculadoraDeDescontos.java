package alura.carecarestinga.loja.desconto;

import java.math.BigDecimal;

import alura.carecarestinga.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {
	
	public BigDecimal calcular(Orcamento orcamento) {
		Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItens(
				new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
						new SemDesconto()));
		return desconto.calcular(orcamento);
	}

}
