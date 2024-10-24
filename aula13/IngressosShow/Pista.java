package aula13.IngressosShow;

public class Pista extends Ingresso {

	public Pista() {
		super(40f, "Ingresso Pista (na pista)");
	}

	@Override
	public String toString() {
		return "Pista [valor=" + valor + ", descricao=" + descricao + "]";
	}
	
}
