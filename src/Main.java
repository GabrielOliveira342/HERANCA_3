
public class Main {
	    public static void main(String[] args) {
	    	Automovel carro = new Automovel("Civic", 2020, 5, "ABS", true);
	    	System.out.println(carro.gerarInsert());

	    	Motocicleta moto = new Motocicleta("Honda Fan", 2019, 160, 65);
	        System.out.println(moto.gerarInsert());

	        Caminhao caminhao = new Caminhao("FH", 2021, 4, 18000);
	        System.out.println(caminhao.gerarInsert());

	        Bicicleta bike = new Bicicleta("Oggi", 2021, "X-Caliber", "Vermelho", "Alumínio", 21, true);
	        System.out.println(bike.gerarInsert());

	        Skate skate = new Skate("Santa Cruz", 2019, "Pro Model", "Azul", "PU");
	        System.out.println(skate.gerarInsert());
	    }
	}

