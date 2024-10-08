package aula11.ProdutoTvRadioVideogame;

public class Radio extends Produto {
	private int potenciaRMS;

	public Radio(String nome, float preco, String marca, int potenciaRMS) {
		super(nome, preco, marca);
		this.potenciaRMS = potenciaRMS;
	}

	public int getPotenciaRMS() {
		return potenciaRMS;
	}
	public void setPotenciaRMS(int potenciaRMS) {
		this.potenciaRMS = potenciaRMS;
	}

	@Override
	public String toString() {
		return "Radio [potenciaRMS=" + potenciaRMS + 
				", nome=" + nome + ", preco=" + preco + ", marca=" + marca + "]";
	}
	
}
