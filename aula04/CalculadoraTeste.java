package aula04;

import java.util.Scanner;

public class CalculadoraTeste {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
//		System.out.println("Resultado da soma: " + calc.somar(4, 5));
//		System.out.println("Resultado da subtracao: " + calc.subtrair(6, 4));
		
		Scanner entrada = new Scanner(System.in);
		entrada.nextInt();

		calc.somar(4, 5);
		System.out.println(calc.ultimaOperacao() + " = " + calc.ultimoResultado());
		
		calc.subtrair(6, 4);
		System.out.println(calc.ultimaOperacao() + " = " + calc.ultimoResultado());
		
		System.out.println(Calculadora.somar_estatico(5, 7));
		System.out.println(Calculadora.subtrair_estatico(10, 7));
		
		

	}

}
