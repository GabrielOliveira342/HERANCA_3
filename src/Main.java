public class Main {
    
	public static void main(String[] args) {
        // Criando um objeto Automóvel e apresentando os dados
        Automovel carro = new Automovel("Civic", 2020, 5, "ABS", true);
        System.out.println(carro.gerarInsert());
        // Salvando o automóvel no banco de dados
        carro.salvar();

        // Criando um objeto Motocicleta e apresentando os dados
        Motocicleta moto = new Motocicleta("Honda Fan", 2019, 160, 65);
        System.out.println(moto.gerarInsert());
        // Salvando a motocicleta no banco de dados
        moto.salvar();

        // Criando um objeto Caminhão e apresentando os dados
        Caminhao caminhao = new Caminhao("FH", 2021, 4, 18000);
        System.out.println(caminhao.gerarInsert());
        // Salvando o caminhão no banco de dados
        caminhao.salvar();

        // Criando um objeto Bicicleta e apresentando os dados
        Bicicleta bike = new Bicicleta("Oggi", 2021, "X-Caliber", "Vermelho", "Alumínio", 21, true);
        System.out.println(bike.gerarInsert());
        // Salvando a bicicleta no banco de dados
        bike.salvar();

        // Criando um objeto Skate e apresentando os dados
        Skate skate = new Skate("Santa Cruz", 2019, "Pro Model", "Azul", "PU");
        System.out.println(skate.gerarInsert());
        // Salvando o skate no banco de dados
        skate.salvar();
    }
}
