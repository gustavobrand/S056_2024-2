package aula01;

import java.util.Scanner;

public class teste02 {

	public static void main(String[] args) {
		Scanner entrada  = new Scanner(System.in);
		float lado, area;
		System.out.print("Entre com o lado do quadrado: ");
		lado = entrada.nextFloat();
		area = lado*lado;
		System.out.println("A area calculada foi: " + area + " cm2");
	}

}
