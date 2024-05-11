package alura.carecarestinga.loja;

import java.math.BigDecimal;

import alura.carecarestinga.loja.imposto.ICMS;
import alura.carecarestinga.loja.imposto.ISS;
import alura.carecarestinga.loja.imposto.Imposto;
import alura.carecarestinga.loja.orcamento.ItemOrcamento;
import alura.carecarestinga.loja.orcamento.Orcamento;

public class TestesImposto {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));

		Imposto imposto = new ICMS(new ISS(null));
		System.out.println(imposto.calcular(orcamento));
	}

}
