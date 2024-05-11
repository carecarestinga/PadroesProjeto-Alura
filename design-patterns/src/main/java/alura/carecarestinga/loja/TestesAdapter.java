package alura.carecarestinga.loja;

import java.math.BigDecimal;

import alura.carecarestinga.loja.http.ApacheHttpAdapter;
import alura.carecarestinga.loja.orcamento.ItemOrcamento;
import alura.carecarestinga.loja.orcamento.Orcamento;
import alura.carecarestinga.loja.orcamento.RegistroOrcamento;

public class TestesAdapter {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(BigDecimal.TEN));
		orcamento.aprovar();
		orcamento.finalizar();

		RegistroOrcamento registro = new RegistroOrcamento(new ApacheHttpAdapter());
		registro.registrar(orcamento);
	}

}
