package aula05;

public class ContaExemploTeste {

	public static void main(String[] args) {
		ContaExemplo c1 = new ContaExemplo();
	
//		c1.saldo = 100;
//		c1.numeroConta = 1111;
		
		c1.setSaldo(100);
		c1.setNumeroConta("1111");
		
		System.out.println(c1.getNumeroConta());
		System.out.println(c1.getSaldo());
	}
}
