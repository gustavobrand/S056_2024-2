package aula07;

import java.util.Scanner;

public class PessoaAtiv04T1Teste {

	public static void main(String[] args) {
		PessoaAtiv04T1 p1 = new PessoaAtiv04T1();
		PessoaAtiv04T1 p2 = new PessoaAtiv04T1();
		
//		p1.setNome("Joao");
//		p1.setIdade(30);
//		p1.setEndereco("Rua Abc 111");
//		p2.setNome("Maria");
//		p2.setIdade(25);
//		p2.setEndereco("Rua Xyz 222");
		
		// 1a forma de uso de sets com entrada do teclado
		Scanner entrada = new Scanner(System.in);
		System.out.print("Entre com o nome: ");
		String nome = entrada.next();
		System.out.print("Entre com a idade: ");
		int idade = entrada.nextInt();
		entrada.nextLine();
		System.out.print("Entre com o endereço: ");
		String end = entrada.nextLine();
		p1.setNome(nome);
		p1.setIdade(idade);
		p1.setEndereco(end);

		// 2a forma de uso de sets com entrada do teclado
		System.out.print("Entre com o nome: ");
		p2.setNome(entrada.next());
		System.out.print("Entre com a idade: ");
		p2.setIdade(entrada.nextInt());
		System.out.print("Entre com o endereço: ");
		entrada.nextLine();
		p2.setEndereco(entrada.nextLine());


		System.out.println("Nome: " + p1.getNome() + ", idade: " + 
				p1.getIdade() + ". Endereço: " + p1.getEndereco());
		System.out.println("Nome: " + p2.getNome() + ", idade: " + 
				p2.getIdade() + ". Endereço: " + p2.getEndereco());

	}
}
