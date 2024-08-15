package aula03;

public class atividade01T1 {

	public static void main(String[] args) {		
		for (int i=1; i<=100; i++) {
//			parOuImpar(i);
			if (ehPar(i)) {
				System.out.println("Valor PAR" + i);
			} else {
				System.out.println("Valor IMPAR" + i);
			}
		}
	}
	
	public static boolean ehPar(int valor) {
		if (valor%2 == 0) {
			return true;
		}
		return false;
	}
	
	public static void parOuImpar(int valor) {
		if (valor%2 == 0) {
			// Nro par
			System.out.println("Nro PAR: " + valor);
		} else {
			// Nro impar
			System.out.println("Nro IMPAR: " + valor);
		}
	}
	
}
