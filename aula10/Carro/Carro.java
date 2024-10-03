package aula10.Carro;

import java.util.ArrayList;

public class Carro {
	private int ano;
	private String cor;
	private Motor motor;
	private Cambio cambio;
	private ArrayList<Pneu> pneus;
	private ArrayList<Banco> bancos;
	
	public Carro(int ano, String cor, Motor motor, Cambio cambio, 
			ArrayList<Pneu> pneus, ArrayList<Banco> bancos) {
		this.ano = ano;
		this.cor = cor;
		this.motor = motor;
		this.cambio = cambio;
		this.pneus = pneus;
		this.bancos = bancos;
	}
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public Cambio getCambio() {
		return cambio;
	}
	public void setCambio(Cambio cambio) {
		this.cambio = cambio;
	}
	public ArrayList<Pneu> getPneus() {
		return pneus;
	}
	public void setPneus(ArrayList<Pneu> pneus) {
		this.pneus = pneus;
	}
	public ArrayList<Banco> getBancos() {
		return bancos;
	}
	public void setBancos(ArrayList<Banco> bancos) {
		this.bancos = bancos;
	}
	
	@Override
	public String toString() {
		return "Carro [ano=" + ano + ", cor=" + cor + ", motor=" + motor + ", cambio=" + cambio + ", pneus=" + pneus
				+ ", bancos=" + bancos + "]";
	}
}
