package aula10.Carro;

public class Pneu {
	private int aro;
	private int velocidade;
	private int largura;
	private String descricao;
	public Pneu(int aro, int velocidade, int largura, String descricao) {
		this.aro = aro;
		this.velocidade = velocidade;
		this.largura = largura;
		this.descricao = descricao;
	}
	public int getAro() {
		return aro;
	}
	public void setAro(int aro) {
		this.aro = aro;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public int getLargura() {
		return largura;
	}
	public void setLargura(int largura) {
		this.largura = largura;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Override
	public String toString() {
		return "Pneu [aro=" + aro + ", velocidade=" + velocidade + ", largura=" + largura + ", descricao=" + descricao
				+ "]";
	}
}