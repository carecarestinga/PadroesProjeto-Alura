package alura.carecarestinga.escola.dominio.aluno;

import java.util.List;

public interface RepositorioDeAlunos {
	
	void matricular(Aluno aluno);
	
	Aluno buscarPorCPF(CPF cpf);
	
	List<Aluno> listarTodosAlunosMatriculados();
	
	//...

}
