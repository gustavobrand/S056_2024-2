package aula06;

public class ComputadorTeste {

	public static void main(String[] args) {
		Computador c1 = new Computador("Meu computador", 1500);
		System.out.println(c1.mostraNomeComputador());
		System.out.println(c1.mostraClock());
		
		c1.setNome("Novo Computador");
		c1.setClock(1600);
		System.out.println(c1.mostraNomeComputador());
		System.out.println(c1.mostraClock());
	}

}






