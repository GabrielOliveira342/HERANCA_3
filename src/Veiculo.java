
public class Veiculo {
		
	private String modelo;
	private int anoFabricacao;
	
public Veiculo (String modelo, int anoFabricacao){
	this.modelo = modelo;
	this.anoFabricacao = anoFabricacao;
}

public String getModelo () {
	return modelo;
}
public void setModelo (String modelo) {
	if (modelo == null || modelo.isEmpty()) {
		throw new IllegalArgumentException("O modelo é obrigatorio. ");
	}
	this.modelo = modelo;
}
public int getAnoFabricacao() {
	return anoFabricacao;
}
public void setAnoFabricacao(int anoFabricacao) {
	if (anoFabricacao < 1886) {
		throw new IllegalArgumentException("Ano de fabricação inválido");
	}
	this.anoFabricacao = anoFabricacao;
}
public String gerarInsert() {
	return String.format("INSERT INTO Veiculo (modelo, null) VALUES ('%S', %d);", modelo, anoFabricacao);
}
}
