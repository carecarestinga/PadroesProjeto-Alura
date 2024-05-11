package alura.carecarestinga.escola.aplicacao.aluno.matricular;

import alura.carecarestinga.escola.dominio.aluno.Aluno;
import alura.carecarestinga.escola.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {
	
	private final RepositorioDeAlunos repositorio;

	public MatricularAluno(RepositorioDeAlunos repositorio) {
		this.repositorio = repositorio;
	}
	
	// COMMAND
	public void executa(MatricularAlunoDto dados) {
		Aluno novo = dados.criarAluno();
		repositorio.matricular(novo);
		System.out.println("Aluno Novo de Nome " + novo.getNome());
	}

}
