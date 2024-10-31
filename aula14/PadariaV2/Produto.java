package aula14.PadariaV2;

public class Produto {
	protected String nome;
	protected float precoUnidade;
	protected String marca;
    
    public Produto(String nome, float precoUnidade, String marca) {
		this.nome = nome;
		this.precoUnidade = precoUnidade;
		this.marca = marca;
	}
    
    public static void mostrar(Produto p) {
    	p.descricao();
    }
    
    public void descricao() {
		System.out.println(this.toString());
    } 

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPrecoUnidade() {
		return precoUnidade;
	}

	public void setPrecoUnidade(float precoUnidade) {
		this.precoUnidade = precoUnidade;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", precoUnidade=" + precoUnidade + ", marca=" + marca + "]";
	}

}
