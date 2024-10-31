package aula14.PadariaV2;

import java.util.ArrayList;

public class CarrinhoDeCompras {
	private ArrayList<Produto> listaDeCompras;
	
	public CarrinhoDeCompras() {
		listaDeCompras = new ArrayList<Produto>();
	}
	public void AdicionarItem(Produto item) {
		listaDeCompras.add(item);
	}
	public void MostrarItens() {
		for (Produto p : listaDeCompras) {
			System.out.println(p);
		}
	}
	public float CalcularTotalDasCompras() {
		float total = 0;
		for (Produto p : listaDeCompras) {
			total = total + p.getPrecoUnidade();
		}
		return total;
	}
	
	
	
}
