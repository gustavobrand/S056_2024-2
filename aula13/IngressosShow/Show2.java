package aula13.IngressosShow;

import java.util.ArrayList;

public class Show2 {
	private ArrayList<Ingresso> tickets;
	
	public Show2() {
		this.tickets = new ArrayList<Ingresso>();
	}
	public boolean AdicionarIngresso(Ingresso t) {
		if (tickets.size() < 4) {
			tickets.add(t);
			return true;
		}
		return false;
	}
	public void mostraIngressos() {
		for (Ingresso i : tickets) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		BackStage ingresso1 = new BackStage();
		Vip ingresso2 = new Vip();
		Pista ingresso3 = new Pista();
		Pista ingresso4 = new Pista();
		Pista ingresso5 = new Pista();
		
		Show2 evento = new Show2();
		evento.AdicionarIngresso(ingresso1);
		evento.AdicionarIngresso(ingresso2);
		evento.AdicionarIngresso(ingresso3);
		evento.AdicionarIngresso(ingresso4);
		evento.AdicionarIngresso(ingresso5);
		evento.mostraIngressos();
		
	}

}
