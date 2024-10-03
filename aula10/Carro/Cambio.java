package aula10.Carro;

public class Cambio {
	private String tipo; // manual e automatico
	private int nroMarchas;
	
	public Cambio(String tipo, int nroMarchas) {
		this.tipo = tipo;
		this.nroMarchas = nroMarchas;
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getNroMarchas() {
		return nroMarchas;
	}
	public void setNroMarchas(int nroMarchas) {
		this.nroMarchas = nroMarchas;
	}

	@Override
	public String toString() {
		return "Cambio [tipo=" + tipo + ", nroMarchas=" + nroMarchas + "]";
	}	
}
