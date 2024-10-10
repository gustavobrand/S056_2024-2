package aula11.ProdutoTvRadioVideogame;

public class Tv extends Produto {
	private int tamanho;
	private String tipo;
	
	public Tv(String nome, float preco, String marca, 
			int tamanho, String tipo) {
		super(nome, preco, marca);
		this.tamanho = tamanho;
		this.tipo = tipo;
	}
	
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "Tv [tamanho=" + tamanho + ", tipo=" + tipo + 
				", nome=" + nome + ", preco=" + preco + ", marca=" + marca
				+ "]";
	}
	
}
