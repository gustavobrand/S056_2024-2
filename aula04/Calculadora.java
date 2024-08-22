package aula04;

public class Calculadora {
	int valor;
	String operacao;
	
	int somar(int a, int b) {
		operacao = "soma";
		valor = a+b;
		return valor;
	}
	static int somar_estatico(int a, int b) {
		return a+b;
	}
	int subtrair(int a, int b) {
		operacao = "subtracao";
		valor = a-b;
		return valor;
	}
	static int subtrair_estatico(int a, int b) {
		return a-b;
	}
	int ultimoResultado() {
		return valor;
	}
	String ultimaOperacao() {
		return operacao;
	}
}
