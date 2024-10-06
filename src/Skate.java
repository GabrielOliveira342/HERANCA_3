
public class Skate extends Veiculo {
	
	private String marca;
	private String cor;
	private String tipoRoda;
	
public Skate (String modelo, int anoFabricacao, String marca, String cor, String tipoRoda) {
	
	super (modelo, anoFabricacao);
	this.marca = marca;
	this.cor = cor;
	this.tipoRoda = tipoRoda;
}

public String getMarca() {
    return marca;
}

public void setMarca(String marca) {
    this.marca = marca;
}

public String getCor() {
    return cor;
}

public void setCor(String cor) {
    this.cor = cor;
}

public String getTipoRoda() {
    return tipoRoda;
}

public void setTipoRoda(String tipoRoda) {
    this.tipoRoda = tipoRoda;
}

public String gerarInsert() {
    return String.format("INSERT INTO Skate (modelo, ano_fabricacao, marca, cor, tipoRoda) " +
                         "VALUES ('%s', '%s', '%s', '%s');",
                          getModelo(), getAnoFabricacao(), marca, cor, tipoRoda);
}
}
