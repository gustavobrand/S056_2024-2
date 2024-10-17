package aula12.Veiculo3niveis;

public class Moto extends Veiculo {
	protected boolean bau;
	protected boolean cavalete;
	protected String tipoPartida;
	protected String posicaoPiloto;
	protected String estilo;
	protected int cilindrada;
	
	public Moto(int capacidadeTanque, String cor, String marca, String modelo, 
			boolean bau, boolean cavalete, String tipoPartida, 
			String posicaoPiloto, String estilo, int cilindrada) {
		
		super(capacidadeTanque, cor, marca, modelo);
		this.bau = bau;
		this.cavalete = cavalete;
		this.tipoPartida = tipoPartida;
		this.posicaoPiloto = posicaoPiloto;
		this.estilo = estilo;
		this.cilindrada = cilindrada;
	}
	
	public boolean isBau() {
		return bau;
	}
	public void setBau(boolean bau) {
		this.bau = bau;
	}
	public boolean isCavalete() {
		return cavalete;
	}
	public void setCavalete(boolean cavalete) {
		this.cavalete = cavalete;
	}
	public String getTipoPartida() {
		return tipoPartida;
	}
	public void setTipoPartida(String tipoPartida) {
		this.tipoPartida = tipoPartida;
	}
	public String getPosicaoPiloto() {
		return posicaoPiloto;
	}
	public void setPosicaoPiloto(String posicaoPiloto) {
		this.posicaoPiloto = posicaoPiloto;
	}
	public String getEstilo() {
		return estilo;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	@Override
	public String toString() {
		return "Moto: bau=" + bau + ", cavalete=" + cavalete + ", tipoPartida=" + tipoPartida + "\n, posicaoPiloto="
				+ posicaoPiloto + ", estilo=" + estilo + ", cilindrada=" + cilindrada + "\n, capacidadeTanque="
				+ capacidadeTanque + ", cor=" + cor + ", marca=" + marca + ", modelo=" + modelo + "]";
	}
	
}
