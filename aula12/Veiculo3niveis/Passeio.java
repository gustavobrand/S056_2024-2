package aula12.Veiculo3niveis;

public class Passeio extends Carro {
	private boolean engateReboque;

	public Passeio(int capacidadeTanque, String cor, String marca, String modelo, int nroPortas, boolean tetoSolar,
			int capPortaMalas, String tipoDeDirecao, boolean kitMultimida, int potencia, boolean engateReboque) {
		super(capacidadeTanque, cor, marca, modelo, nroPortas, tetoSolar, capPortaMalas, tipoDeDirecao, kitMultimida,
				potencia);
		this.engateReboque = engateReboque;
	}
	public boolean isEngateReboque() {
		return engateReboque;
	}
	public void setEngateReboque(boolean engateReboque) {
		this.engateReboque = engateReboque;
	}
	@Override
	public String toString() {
		return "Passeio [engateReboque=" + engateReboque + ", nroPortas=" + nroPortas + ", tetoSolar=" + tetoSolar
				+ ", capPortaMalas=" + capPortaMalas + ", tipoDeDirecao=" + tipoDeDirecao + ", kitMultimida="
				+ kitMultimida + ", potencia=" + potencia + ", capacidadeTanque=" + capacidadeTanque + ", cor=" + cor
				+ ", marca=" + marca + ", modelo=" + modelo + "]";
	}
	
}
