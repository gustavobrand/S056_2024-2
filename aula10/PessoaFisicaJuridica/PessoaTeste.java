package aula10.PessoaFisicaJuridica;

public class PessoaTeste {

	public static void main(String[] args) {
		PessoaFisica pf = new PessoaFisica("Joao", "Rua abc 100", 
				32423423, "111111111", "22222222");
		System.out.println(pf.getNome());
		System.out.println(pf.getEndereco());
		System.out.println(pf.getTelefone());
		System.out.println(pf.getCpf());
		System.out.println(pf.getRg());
	}
}
