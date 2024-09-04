package aula06;

public class MotoTeste {

	public static void main(String[] args) {
		Moto m1 = new Moto();
		Moto m2 = new Moto();
		
		m1.setNome("Moto da semana");
		m2.setNome("Moto do findi");
		m1.setMarca("Honda");
		m2.setMarca("BMW");
		m1.setPeso(170);
		m2.setPeso(350);
		m1.setPotencia(150);
		m2.setPotencia(750);
		
		System.out.println(m1.getNome() + ", marca: " + m1.getMarca() + 
				", peso: " + m1.getPeso() + ", potencia: " + m1.getPotencia());
		System.out.println(m2.getNome() + ", marca: " + m2.getMarca() + 
				", peso: " + m2.getPeso() + ", potencia: " + m2.getPotencia());
		

	}

}
