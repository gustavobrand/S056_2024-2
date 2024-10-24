package aula13.IngressosShow;

public class BackStage extends Ingresso {

	public BackStage() {
		super(100f, "Ingresso BackStage (perto do palco)");
	}

	@Override
	public String toString() {
		return "BackStage [valor=" + valor + ", descricao=" + descricao + "]";
	}
	
}
