package aula12.Veiculo3niveis;

public class Carro extends Veiculo {
	protected int nroPortas; 
	protected boolean tetoSolar;
	protected int capPortaMalas;
	protected String tipoDeDirecao;
	protected boolean kitMultimida;
	protected int potencia;
	
	public Carro(int capacidadeTanque, String cor, String marca, String modelo, 
			int nroPortas, boolean tetoSolar, int capPortaMalas, 
			String tipoDeDirecao, boolean kitMultimida, int potencia) {
		
		super(capacidadeTanque, cor, marca, modelo);
		this.nroPortas = nroPortas;
		this.tetoSolar = tetoSolar;
		this.capPortaMalas = capPortaMalas;
		this.tipoDeDirecao = tipoDeDirecao;
		this.kitMultimida = kitMultimida;
		this.potencia = potencia;
	}

	public int getNroPortas() {
		return nroPortas;
	}

	public void setNroPortas(int nroPortas) {
		this.nroPortas = nroPortas;
	}

	public boolean isTetoSolar() {
		return tetoSolar;
	}

	public void setTetoSolar(boolean tetoSolar) {
		this.tetoSolar = tetoSolar;
	}

	public int getCapPortaMalas() {
		return capPortaMalas;
	}

	public void setCapPortaMalas(int capPortaMalas) {
		this.capPortaMalas = capPortaMalas;
	}

	public String getTipoDeDirecao() {
		return tipoDeDirecao;
	}

	public void setTipoDeDirecao(String tipoDeDirecao) {
		this.tipoDeDirecao = tipoDeDirecao;
	}

	public boolean isKitMultimida() {
		return kitMultimida;
	}

	public void setKitMultimida(boolean kitMultimida) {
		this.kitMultimida = kitMultimida;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Carro [nroPortas=" + nroPortas + ", tetoSolar=" + tetoSolar + ", capPortaMalas=" + capPortaMalas
				+ "\n, tipoDeDirecao=" + tipoDeDirecao + ", kitMultimida=" + kitMultimida + ", potencia=" + potencia
				+ "\n, capacidadeTanque=" + capacidadeTanque + ", cor=" + cor + ", marca=" + marca + ", modelo=" + modelo
				+ "]";
	}
	
}
