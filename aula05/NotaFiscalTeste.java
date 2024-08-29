package aula05;

public class NotaFiscalTeste {

	public static void main(String[] args) {
		NotaFiscal nf1 = new NotaFiscal();		
		nf1.nomeItem1 = "Maça";
		nf1.nomeItem2 = "Pera";
		nf1.precoItem1 = 2f;
		nf1.precoItem2 = 3f;
		System.out.println("Produtos: "+ nf1.mostraNomeItem1()+
			", " + nf1.mostraNomeItem2() + " = R$" + nf1.calculaNotaFiscal());
		
		NotaFiscal nf2 = new NotaFiscal();
		nf2.nomeItem1 = "Computador";
		nf2.nomeItem2 = "Notebook";
		nf2.precoItem1 = 1499.99f;
		nf2.precoItem2 = 1999.99f;
		System.out.println("Produtos: "+ nf2.mostraNomeItem1()+
			", " + nf2.mostraNomeItem2() + " = R$" + nf2.calculaNotaFiscal());

		NotaFiscal nf3 = new NotaFiscal();
		nf3.nomeItem1 = "Carro";
		nf3.nomeItem2 = "Apartamento";
		nf3.precoItem1 = 9999.99f;
		nf3.precoItem2 = 101000f;
		System.out.println("Produtos: "+ nf3.mostraNomeItem1()+
			", " + nf3.mostraNomeItem2() + " = R$" + nf3.calculaNotaFiscal());

		
	}

}
