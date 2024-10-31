package aula14.PadariaV2;

public class Queijo extends Produto {
	protected String tipoQueijo; // (colonial, lanche, mussarela, gouda) 
	protected float percentualLactose;
	
	public Queijo(String nome, float precoUnidade, String marca, String tipoQueijo, 
			float percentualLactose) {
		super(nome, precoUnidade, marca);
		this.tipoQueijo = tipoQueijo;
		this.percentualLactose = percentualLactose;
	}
	
	public String getTipoQueijo() {
		return tipoQueijo;
	}

	public void setTipoQueijo(String tipoQueijo) {
		this.tipoQueijo = tipoQueijo;
	}

	public float getPercentualLactose() {
		return percentualLactose;
	}

	public void setPercentualLactose(float percentualLactose) {
		this.percentualLactose = percentualLactose;
	}

	public void descricao() {
		System.out.println(this.toString());
	}    
    public boolean contemLactose() {
    	if (percentualLactose > 0) {
    		return true;
    	}
    	return false;
    }

	@Override
	public String toString() {
		return "Queijo [tipoQueijo=" + tipoQueijo + 
				", percentualLactose=" + percentualLactose + 
				", nome=" + nome + ", precoUnidade=" + precoUnidade + 
				", marca=" + marca + "]";
	}
    
}
