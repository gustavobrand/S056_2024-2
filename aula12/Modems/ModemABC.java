package aula12.Modems;

public class ModemABC extends Modem {
	private int velocPortaCoaxial;
	private String tipoCaboCoaxial;
	
	public ModemABC(String nome, String modelo, int velocidadeUploadDownload, 
			int quantPortasEthernet,
			int velocPortaCoaxial, String tipoPortaCoaxial) {
		super(nome, modelo, velocidadeUploadDownload, quantPortasEthernet);
		this.velocPortaCoaxial = velocPortaCoaxial;
		this.tipoCaboCoaxial = tipoPortaCoaxial;
	}
	
	public String caboGrossoOuFino() {
		if (tipoCaboCoaxial == "10base2") {
			return "FINO";
		} else if (tipoCaboCoaxial == "10base5") {
			return "GROSSO";
		}
		return "INDEFINIDO";
	}
	
	public int getQuantPortasEthernet() {
		return 2;
	}	
	
	public int getVelocPortaCoaxial() {
		return velocPortaCoaxial;
	}
	public void setVelocPortaCoaxial(int velocPortaCoaxial) {
		this.velocPortaCoaxial = velocPortaCoaxial;
	}
	public String getTipoCaboCoaxial() {
		return tipoCaboCoaxial;
	}
	public void setTipoCaboCoaxial(String tipoCaboCoaxial) {
		this.tipoCaboCoaxial = tipoCaboCoaxial;
	}
	
	@Override
	public String toString() {
		return "ModemABC [velocPortaCoaxial=" + velocPortaCoaxial + 
				", tipoPortaCoaxial=" + tipoCaboCoaxial + ", nome="
				+ nome + ", modelo=" + modelo + 
				", velocidadeUploadDownload=" + velocidadeUploadDownload
				+ ", quantPortasEthernet=" + getQuantPortasEthernet() + "]";
	}
	
}
