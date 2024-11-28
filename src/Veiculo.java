//super class Veiculo 
public class Veiculo {
//atributos da class 		
	private String modelo;
	private int anoFabricacao;
//construtores e os parametros 	
public Veiculo (String modelo, int anoFabricacao){
	this.modelo = modelo;
	this.anoFabricacao = anoFabricacao;
}
//getters e setters 
public String getModelo () {
	return modelo;
}
public void setModelo (String modelo) {
	if (modelo == null || modelo.isEmpty()) {
		throw new IllegalArgumentException("O modelo é obrigatorio. "); //metodo para apresentar invalidez do parametro 
	}
	this.modelo = modelo;
}
public int getAnoFabricacao() {
	return anoFabricacao;
}
public void setAnoFabricacao(int anoFabricacao) {
	if (anoFabricacao < 1886) {
		throw new IllegalArgumentException("Ano de fabricação inválido"); //metodo para apresentar invalidez do parametro 
	}
	this.anoFabricacao = anoFabricacao;
}
//metodo para usar INSERT
public String gerarInsert() {
	return String.format("INSERT INTO Veiculo (modelo, null) VALUES ('%S', %d);", modelo, anoFabricacao);
}
}
