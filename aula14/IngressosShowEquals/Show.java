package aula14.IngressosShowEquals;

public class Show {

	public static void mostraIngressos(Ingresso ticket) {
		System.out.println(ticket.toString());
	}
	
	public static void main(String[] args) {
		BackStage ingresso1 = new BackStage();
		Vip ingresso2 = new Vip();
		Pista ingresso3 = new Pista();
		
		Show.mostraIngressos(ingresso1);
		Show.mostraIngressos(ingresso2);
		Show.mostraIngressos(ingresso3);
	}

}
