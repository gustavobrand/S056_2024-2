package aula11.PessoaFisicaJuridica;

public class PessoaTeste {

	public static void main(String[] args) {
		PessoaFisica pf = new PessoaFisica("Joao", "Rua abc 100", 
				32423423, "111111111", "22222222");
		System.out.println(pf.getNome());
		System.out.println(pf.getEndereco());
		System.out.println(pf.getTelefone());
		System.out.println(pf.getCpf());
		System.out.println(pf.getRg());
		
		PessoaJuridica pj = new PessoaJuridica("Faculdade Senai", 
				"Av Assis Brasil, SN", 51434534, "235235235", "678679769");
		System.out.println(pj.getNome());
		System.out.println(pj.getEndereco());
		System.out.println(pj.getTelefone());
		System.out.println(pj.getCnpj());
		System.out.println(pj.getInscricaoEstadual());
		
	}
}
