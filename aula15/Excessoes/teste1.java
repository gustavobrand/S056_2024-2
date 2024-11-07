package aula15.Excessoes;

import java.util.ArrayList;

public class teste1 {

	public static void exemplo1() {
		int a = 10;
		int b = 0;
		try {
			System.out.println(a/b);
		} catch (ArithmeticException e) {
			System.out.println("Problema encontrado em uma operacao aritmetica");
		} catch (Exception e) {
			System.out.println("Problema encontrado!");
			e.printStackTrace();
		}
	}
	
	public static void exemplo2() {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		try {
			lista.add(10);
			lista.add(20);
			lista.add(30);
			
			for (int i=0 ; i <= lista.size() ; i++) {
				System.out.print(lista.get(i) + " ");
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Indice inexistente foi acessado!");
		} catch (Exception e) {
			System.out.println("Problema encontrado!");
			e.printStackTrace();
		}
	}

	public static void exemplo3() {
		int a = 10;
		int b = 0;
		try {
			if (a <= 0 ) {
				throw(new Exception("problema no parametro a da divisao"));
			} else if (b <= 0) {
				throw(new Exception("problema no parametro b da divisao"));
			}
			System.out.println(a/b);
		} catch (ArithmeticException e) {
			System.out.println("Problema encontrado em uma operacao aritmetica");
		} catch (Exception e) {
			System.out.println("Problema encontrado!");
			e.printStackTrace();
		}
	}

	// Agora com a nossa propria classe de excessao
	public static void exemplo4() {
		int a = 10;
		int b = 0;
		try {
			if (a <= 0 ) {
				throw(new ExcessaoPersonalizada(
						"problema no parametro a da divisao", 58));
			} else if (b <= 0) {
				throw(new ExcessaoPersonalizada(
						"problema no parametro b da divisao", 59));
			}
			System.out.println(a/b);
		} catch (ExcessaoPersonalizada e) {
			System.out.println(
					"Problema encontrado em uma operacao aritmetica na linha " +
					e.getLinhaDoErro());
		} catch (ArithmeticException e) {
			System.out.println("Problema encontrado em uma operacao aritmetica");
		} catch (Exception e) {
			System.out.println("Problema encontrado!");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
//		teste1.exemplo1();
//		teste1.exemplo2();
//		teste1.exemplo3(); // nós faremos o disparo da excessao
		teste1.exemplo4(); // com uma excessao personalizada (nova clase)
	}
}
