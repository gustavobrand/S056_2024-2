package aula14.IngressosShowEquals;

public class Ingresso {
	protected float valor;
	protected String descricao;
	
	public Ingresso(float valor, String descricao) {
		this.valor = valor;
		this.descricao = descricao;
	}
	
//	public static void mostraIngressos(Ingresso ticket) {
//		System.out.println(ticket.toString());
//	}
	
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + Float.floatToIntBits(valor);
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
		Ingresso other = (Ingresso) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (Float.floatToIntBits(valor) != Float.floatToIntBits(other.valor))
			return false;
		return true;
	}
	
//	@Override
//	public String toString() {
//		return "Ingresso [valor=" + valor + ", descricao=" + descricao + "]";
//	}
	
	
}
