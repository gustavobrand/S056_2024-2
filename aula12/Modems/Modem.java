package aula12.Modems;

public class Modem {
	protected String nome; 
	protected String modelo;
	protected int velocidadeUploadDownload;
	protected int quantPortasEthernet;
	
	public Modem(String nome, String modelo, int velocidadeUploadDownload, int quantPortasEthernet) {
		this.nome = nome;
		this.modelo = modelo;
		this.velocidadeUploadDownload = velocidadeUploadDownload;
		this.quantPortasEthernet = quantPortasEthernet;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getVelocidadeUploadDownload() {
		return velocidadeUploadDownload;
	}
	public void setVelocidadeUploadDownload(int velocidadeUploadDownload) {
		this.velocidadeUploadDownload = velocidadeUploadDownload;
	}
	public int getQuantPortasEthernet() {
		return quantPortasEthernet;
	}
	public void setQuantPortasEthernet(int quantPortasEthernet) {
		this.quantPortasEthernet = quantPortasEthernet;
	}
	
	@Override
	public String toString() {
		return "Modem [nome=" + nome + ", modelo=" + modelo + ", velocidadeUploadDownload=" + velocidadeUploadDownload
				+ ", quantPortasEthernet=" + quantPortasEthernet + "]";
	}
}