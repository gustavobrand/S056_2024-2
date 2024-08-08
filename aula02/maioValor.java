package aula02;

import java.util.Scanner;

public class maioValor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Entre com o valor 1: ");
		int val1 = entrada.nextInt();
		System.out.print("Entre com o valor 2: ");
		int val2 = entrada.nextInt();

		// Formato 1
//		if (val1 > val2) {
//			System.out.println("Maior valor digitado foi " + val1);
//		} else if (val2 > val1) {
//			System.out.println("Maior valor digitado foi " + val2);
//		} else {
//			System.out.println("Valores sao iguais");
//		}
		
		// Formato 2
//		float maiorValor = val2;
//		if (val1 > val2) {
//			maiorValor = val1;
//		} 
//		System.out.println("Maior valor digitado foi " + maiorValor);

		// Formato 3
		if (val1 > val2) {
			System.out.println("Maior valor digitado foi " + val1);
			return;
		} 
		System.out.println("Maior valor digitado foi " + val2);

	}

}
