package alura.carecarestinga.loja.imposto;

import java.math.BigDecimal;

import alura.carecarestinga.loja.orcamento.Orcamento;

public class CalculadoraDeImpostos {

	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.realizarCalculoEspecifico(orcamento);
	}

}
