package aula10.Calculadora;

public class CalculadoraTeste {
	public static void main(String[] args) {
	
		Calculadora c = new Calculadora();
		System.out.println(c.soma(5, 6));
		System.out.println(c.soma(5f, 6f));
		System.out.println(c.soma(5d, 6d));
		System.out.println(c.soma(5, 6, 7));
		System.out.println(c.soma(5f, 6f, 7f));
		System.out.println(c.soma(5d, 6d, 7d));
		System.out.println(c.soma(5, 6l, 7l));
	}
}
