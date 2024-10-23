package aula13.PadariaV1;

public class Pao extends Produto {
	protected String tipoPao; // (pao frances, pao italiano, baguete, etc)
	protected float percentualGluten; 

	public Pao(String nome, float precoUnidade, String marca, String tipoPao, float percentualGluten) {
		super(nome, precoUnidade, marca);
		this.tipoPao = tipoPao;
		this.percentualGluten = percentualGluten;
	}
	
	public String getTipoPao() {
		return tipoPao;
	}

	public void setTipoPao(String tipoPao) {
		this.tipoPao = tipoPao;
	}

	public float getPercentualGluten() {
		return percentualGluten;
	}

	public void setPercentualGluten(float percentualGluten) {
		this.percentualGluten = percentualGluten;
	}

	public void descricao() {
		System.out.println(this.toString());
	}
	
    public boolean contemGlutem() {
    	if (percentualGluten > 0) {
    		return true;
    	}
    	return false;
    }

	@Override
	public String toString() {
		return "Pao [tipoPao=" + tipoPao + 
				", percentualGluten=" + percentualGluten + 
				", nome=" + nome + ", precoUnidade=" + precoUnidade + 
				", marca=" + marca + "]";
	}
    
}
