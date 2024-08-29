package aula05;

public class CarroTeste {

	public static void main(String[] args) {
		Carro fusca = new Carro();
	
		fusca.setNome("Fuscao");
		fusca.setPotencia(1600);
		
		System.out.println(fusca.getNome());
		System.out.println(fusca.getPotencia());
	}
}
