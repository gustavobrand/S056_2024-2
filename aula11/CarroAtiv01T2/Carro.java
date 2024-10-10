package aula11.CarroAtiv01T2;

public class Carro {
	private String nome;
	private String marca;
	private int potencia;
	
	public Carro() {}
	public Carro(String nome, String marca, int potencia) {
		this.nome = nome;
		this.marca = marca;
		this.potencia = potencia;
	}

	public void montaCarro(String nome, String marca, int potencia) {
		setNome(nome);
		setMarca(marca);
		setPotencia(potencia);
	}
	public void montaCarro(String nome, String marca) {
		this.nome = nome;
		this.marca = marca;		
	}
	public void montaCarro(String nome, int potencia) {
		this.nome = nome;
		this.potencia = potencia;		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	@Override
	public String toString() {
		return "Carro [nome=" + nome + ", marca=" + marca + ", potencia=" + potencia + "]";
	}
}
