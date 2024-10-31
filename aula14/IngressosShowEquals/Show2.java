package aula14.IngressosShowEquals;

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
//		BackStage ingresso1 = new BackStage();
//		Vip ingresso2 = new Vip();
//		Pista ingresso3 = new Pista();
//		Pista ingresso4 = new Pista();
//		Pista ingresso5 = new Pista();
		
		Pista p1 = new Pista();
		Pista p2 = p1;
		Pista p3 = new Pista();
		System.out.println(p1);
		System.out.println(p2);
		if (p1 == p3) {
			System.out.println("Enderecos iguais");
		} else {
			System.out.println("Enderecos diferentes");
		}
		if (p1.equals(p3)) {
			System.out.println("Conteudo igual");
		} else {
			System.out.println("Conteudo diferente");
		}
		
		Vip v1 = new Vip();
		
//		Show2 evento = new Show2();
//		evento.AdicionarIngresso(ingresso1);
//		evento.AdicionarIngresso(ingresso2);
//		evento.AdicionarIngresso(ingresso3);
//		evento.AdicionarIngresso(ingresso4);
//		evento.AdicionarIngresso(ingresso5);
//		evento.mostraIngressos();
		
	}

}
