package aula14.IngressosShowEquals;

public class Vip extends Ingresso {

	public Vip() {
		super(70f, "Ingresso VIP (frente do palco)");
	}

	@Override
	public String toString() {
		return "Vip [valor=" + valor + ", descricao=" + descricao + "]";
	}	

}
