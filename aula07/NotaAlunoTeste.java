package aula07;

public class NotaAlunoTeste {

	public static void main(String[] args) {
		NotaAluno joao = new NotaAluno();
		joao.setNomeAluno("Joao");
		joao.setNota1(6f);
		joao.setNota2(7f);
		System.out.println("Aluno(a): " + joao.getNomeAluno() + 
				" ficou com media " + joao.mediaDoAluno());
		joao.statusAluno();
		
		NotaAluno maria = new NotaAluno("Maria", 7f, 8f);
		System.out.println("Aluno(a): " + maria.getNomeAluno() + 
				" ficou com media " + maria.mediaDoAluno());
		maria.statusAluno();
		
		
		

	}

}
