package alura.carecarestinga.rh.service.promocao;

import alura.carecarestinga.rh.ValidacaoException;
import alura.carecarestinga.rh.model.Cargo;
import alura.carecarestinga.rh.model.Funcionario;

public class PromocaoService {
	
	public void promover(Funcionario funcionario, boolean metaBatida) {
		Cargo cargoAtual = funcionario.getCargo();
		if (Cargo.GERENTE == cargoAtual) {
			throw new ValidacaoException("Gerentes nao podem ser promovidos!");
		}
		
		if (metaBatida) {
			Cargo novoCargo = cargoAtual.getProximoCargo();
			funcionario.promover(novoCargo);
		} else {
			throw new ValidacaoException("Funcionario nao bateu a meta!");
		}
	}

}
