package alura.carecarestinga.escola.infra.indicacao;

import alura.carecarestinga.escola.aplicacao.indicacao.EnviarEmailIndicacao;
import alura.carecarestinga.escola.dominio.aluno.Aluno;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao {

	@Override
	public void enviarPara(Aluno indicado) {
		// logica de envio de email com a lib Java Mail
	}
}
