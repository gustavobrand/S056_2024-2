package aula16.RPGIteracao1e2Excessoes;

public class Personagem {
	protected int saude;
	protected int nivel;
	protected boolean vivo;
	
	public Personagem(int saude, int nivel, boolean vivo) {
		this.saude = saude;
		this.nivel = nivel;
		this.vivo = vivo;
	}
	
	public void atacar(Personagem p, int dano) throws Exception {
		if (dano <= 0) {
			throw (new Exception("Dano com valor invalido"));
		}
		if (p == null) {
			throw (new Exception("Personagem recebido é nulo"));
		}
		
		// Um personagem nao pode atacar a si mesmo
		if (this == p) {
			System.out.println("Um personagem nao pode atacar a si mesmo");
			return;
		}
		int novoDano = dano;
		if ( (p.getNivel() - nivel) >= 5) {
			// Se o alvo estiver 5 ou mais níveis acima do atacante, o dano é reduzido em 50%
			// Dano deve ser reduzido em 50%
			novoDano = novoDano / 2;
		} else if ( (nivel - p.getNivel()) >= 5) {
			// Se o alvo estiver 5 ou mais níveis abaixo do atacante, o dano aumenta em 50%
			// Dano deve ser aumentado em 50%
			novoDano = (int) (novoDano * 1.5);
		}		
		
		int novaSaude = p.getSaude() - novoDano;
		if (novaSaude <= 0) {
			// O personagem deve morrer, saude = 0
			System.out.println("Saude sendo zerada ao sofrer o ataque - personagem morreu");
			p.setSaude(0);
			p.setVivo(false);
		} else {
			System.out.println("Nivel de saude alterado para " + novaSaude + " ao sofrer o ataque");
			p.setSaude(novaSaude);
		}			
	}
	
	public void curar(Personagem p, int cura) throws Exception {
		if (cura <= 0) {
			throw (new Exception("Cura com valor invalido"));
		}
		if (p == null) {
			throw (new Exception("Personagem recebido é nulo"));
		}
		
		// Um personagem so pode curar a si mesmo
		if (this != p) {
			System.out.println("Um personagem so pode curar a si mesmo");
			return;
		}
		
		if (!p.isVivo()) {
			System.out.println("Um personagem precisa estar vivo para ser curado");
			return;
		}
			
		int novaSaude = p.getSaude() + cura;
		if (novaSaude > 1000) {
			System.out.println("Nivel maximo de saude atingido - 1000 - ao realizar a cura");
			p.setSaude(1000);
		} else {
			System.out.println("Nivel de saude alterado para " + novaSaude + " ao realizar a cura");
			p.setSaude(novaSaude);
		}			
	}
	
	public int getSaude() {;
		return saude;
	}
	public void setSaude(int saude) throws Exception {
		if (saude < 0) {
			throw (new Exception("Nivel de saude invalido"));
		}
		this.saude = saude;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) throws Exception {
		if (nivel < 0) {
			throw (new Exception("Nivel invalido"));
		}
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
