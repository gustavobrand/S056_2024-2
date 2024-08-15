package aula03;

import java.util.Scanner;

public class maioValor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Entre com o valor 1: ");
		int val1 = entrada.nextInt();
		System.out.print("Entre com o valor 2: ");
		int val2 = entrada.nextInt();

		maiorMenorValor(val1, val2);		
	}
	
	public static void maiorMenorValor(int valor1, int valor2) {
		if (valor1 > valor2) {
			System.out.println("Maior valor digitado foi " + valor1);
		} else if (valor2 > valor1) {
			System.out.println("Maior valor digitado foi " + valor2);
		} else {
			System.out.println("Valores sao iguais");
		}
	}

}
