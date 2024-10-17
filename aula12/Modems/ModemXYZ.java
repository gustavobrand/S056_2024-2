package aula12.Modems;

public class ModemXYZ extends Modem {
	private int velocPortaFibra;

	public ModemXYZ(String nome, String modelo, int velocidadeUploadDownload, int quantPortasEthernet,
			int velocPortaFibra) {
		super(nome, modelo, velocidadeUploadDownload, quantPortasEthernet);
		this.velocPortaFibra = velocPortaFibra;
	}
	
	public String verificarVelocidadeDoModem() {
		if (velocPortaFibra > 1000) {
			return "Alta velocidade";
		} 
		return "Baixa velocidade";
	}
	
	public int getQuantPortasEthernet() {
		return 4;
	}

	public int getVelocPortaFibra() {
		return velocPortaFibra;
	}
	public void setVelocPortaFibra(int velocPortaFibra) {
		this.velocPortaFibra = velocPortaFibra;
	}

	@Override
	public String toString() {
		return "ModemXYZ [velocPortaFibra=" + velocPortaFibra + ", nome=" + nome + 
				", modelo=" + modelo + ", velocidadeUploadDownload=" + velocidadeUploadDownload + 
				", quantPortasEthernet=" + getQuantPortasEthernet() + "]";
	}
	
}
