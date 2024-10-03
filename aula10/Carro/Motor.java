package aula10.Carro;

public class Motor {
	private int cavalos;
	private float consumo;
	private int nroValvulas;
	
	public Motor(int cavalos, float consumo, int nroValvulas) {
		this.cavalos = cavalos;
		this.consumo = consumo;
		this.nroValvulas = nroValvulas;
	}
	
	public int getCavalos() {
		return cavalos;
	}
	public void setCavalos(int cavalos) {
		this.cavalos = cavalos;
	}
	public float getConsumo() {
		return consumo;
	}
	public void setConsumo(float consumo) {
		this.consumo = consumo;
	}
	public int getNroValvulas() {
		return nroValvulas;
	}
	public void setNroValvulas(int nroValvulas) {
		this.nroValvulas = nroValvulas;
	}

	@Override
	public String toString() {
		return "Motor [cavalos=" + cavalos + ", consumo=" + consumo + ", nroValvulas=" + nroValvulas + "]";
	}
	
}
