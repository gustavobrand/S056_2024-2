package aula12.Modems;

public class ModemTeste {

	public static void main(String[] args) {
//		ModemABC abc = new ModemABC("Modem 1", "ABC", 10000, 0, 100, "10base2");
//		ModemXYZ xyz = new ModemXYZ("Modem 2", "XYZ", 100000, 0, 10000);
		ModemABC abc = new ModemABC("Modem 1", "ABC", 10000, 0, 100, "10base5");
		ModemXYZ xyz = new ModemXYZ("Modem 2", "XYZ", 100000, 0, 1000);

		System.out.println(abc);
		System.out.println("Tipo de cabo coaxial: " + abc.caboGrossoOuFino() + 
				", Quant de portas ethernet: " + abc.getQuantPortasEthernet());
		
		System.out.println(xyz);
		System.out.println("Velocidade da fibra: " + xyz.verificarVelocidadeDoModem() + 
				", Quant de portas ethernet: " + xyz.getQuantPortasEthernet());
		
	}

}
