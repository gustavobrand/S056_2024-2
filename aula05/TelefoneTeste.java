package aula05;

public class TelefoneTeste {

	public static void main(String[] args) {
		Telefone t1 = new Telefone();
		Telefone t2 = new Telefone();
		t1.setNumeroTelefone("51 99943322");
		t1.setOperadora("Claro");
		System.out.println(t1.getOperadora() + " - fone: " + t1.getNumeroTelefone());

		t2.setNumeroTelefone("51 99943345345");
		t2.setOperadora("Vivo");
		System.out.println(t2.getOperadora() + " - fone: " + t2.getNumeroTelefone());

	}

}
