package aula02;

import java.util.Scanner;

public class teste03 {

	public static void main(String[] args) {
		Scanner entrada  = new Scanner(System.in);
		float lado1, lado2, area;
		
		System.out.print("Entre com o lado 1 do retangulo: ");
		lado1 = entrada.nextFloat();
		System.out.print("Entre com o lado 2 do retangulo: ");
		lado2 = entrada.nextFloat();
		
		area = lado1*lado2;
		System.out.println("A area calculada foi: " + area + " cm2");
	}

}
