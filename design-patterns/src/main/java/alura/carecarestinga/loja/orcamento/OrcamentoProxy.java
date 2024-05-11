package alura.carecarestinga.loja.orcamento;

import java.math.BigDecimal;

public class OrcamentoProxy extends alura.carecarestinga.loja.orcamento.Orcamento {

	private BigDecimal valor;
	private alura.carecarestinga.loja.orcamento.Orcamento orcamento;

	public OrcamentoProxy(Orcamento orcamento) {
		this.orcamento = orcamento;
	}

	public BigDecimal getValor() {
		if (this.valor == null) {
			this.valor = orcamento.getValor();
		}
		return this.valor;
	}

}
