package alura.carecarestinga.loja.imposto;

import java.math.BigDecimal;

import alura.carecarestinga.loja.orcamento.Orcamento;

public class ISS extends alura.carecarestinga.loja.imposto.Imposto {

	public ISS(Imposto outro) {
		super(outro);
	}
	
	public BigDecimal realizarCalculoEspecifico(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.06"));
	}

}
