package aula10.Carro;

public class Banco {
	private String cor;
	private String material;
	private String descricao;
	public Banco(String cor, String material, String descricao) {
		this.cor = cor;
		this.material = material;
		this.descricao = descricao;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Override
	public String toString() {
		return "Banco [cor=" + cor + ", material=" + material + ", descricao=" + descricao + "]";
	}
	
}