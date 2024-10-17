package aula12.Veiculo3niveis;

public class Utilitario extends Carro {
	private int nroOcupantes;
	private boolean temCacamba;
	
	public Utilitario(int capacidadeTanque, String cor, String marca, String modelo, 
			int nroPortas, boolean tetoSolar, int capPortaMalas, 
			String tipoDeDirecao, boolean kitMultimida, int potencia, 
			int nroOcupantes, boolean temCacamba) {
		super(capacidadeTanque, cor, marca, modelo, nroPortas, tetoSolar, capPortaMalas, tipoDeDirecao, kitMultimida,
				potencia);
		this.nroOcupantes = nroOcupantes;
		this.temCacamba = temCacamba;
	}
	
	public int getNroOcupantes() {
		return nroOcupantes;
	}
	public void setNroOcupantes(int nroOcupantes) {
		this.nroOcupantes = nroOcupantes;
	}
	public boolean isTemCacamba() {
		return temCacamba;
	}
	public void setTemCacamba(boolean temCacamba) {
		this.temCacamba = temCacamba;
	}
	
	@Override
	public String toString() {
		return "Utilitario [nroOcupantes=" + nroOcupantes + ", temCacamba=" + temCacamba + ", nroPortas=" + nroPortas
				+ ", tetoSolar=" + tetoSolar + ", capPortaMalas=" + capPortaMalas + ", tipoDeDirecao=" + tipoDeDirecao
				+ ", kitMultimida=" + kitMultimida + ", potencia=" + potencia + ", capacidadeTanque=" + capacidadeTanque
				+ ", cor=" + cor + ", marca=" + marca + ", modelo=" + modelo + "]";
	}
	
}
