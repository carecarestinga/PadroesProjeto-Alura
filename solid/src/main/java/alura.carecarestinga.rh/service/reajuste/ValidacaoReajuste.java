package alura.carecarestinga.rh.service.reajuste;

import java.math.BigDecimal;

import alura.carecarestinga.rh.model.Funcionario;

public interface ValidacaoReajuste {
	
	void validar(Funcionario funcionario, BigDecimal aumento);

}
