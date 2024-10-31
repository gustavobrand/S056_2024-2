package aula14.RPGIteracao1;

public class Personagem {
	protected int saude;
	protected int nivel;
	protected boolean vivo;
	
	public Personagem(int saude, int nivel, boolean vivo) {
		this.saude = saude;
		this.nivel = nivel;
		this.vivo = vivo;
	}
	
	public void atacar(Personagem p, int dano) {
		// Exemplo de como interagir com o objeto p que esta sendo atacado
		// voces devem implementar o restante das funcionlidades mencionadas
		// na iteracao 1 e 2.
		int novaSaude = p.getSaude() - dano;
		p.setSaude(novaSaude);
		
	}
	
	public int getSaude() {;
		return saude;
	}
	public void setSaude(int saude) {
		this.saude = saude;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public boolean isVivo() {
		return vivo;
	}
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
	@Override
	public String toString() {
		return "Personagem [saude=" + saude + ", nivel=" + nivel + ", vivo=" + vivo + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + nivel;
		result = prime * result + saude;
		result = prime * result + (vivo ? 1231 : 1237);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personagem other = (Personagem) obj;
		if (nivel != other.nivel)
			return false;
		if (saude != other.saude)
			return false;
		if (vivo != other.vivo)
			return false;
		return true;
	}
	
}
