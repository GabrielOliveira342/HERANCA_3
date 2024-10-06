
public class Automovel extends Veiculo{

	private int maxPassageiros;
	private String tipoFreio;
	private boolean airbag;
	
public Automovel(String modelo, int anoFabricacao, int maxPassageiros, String tipoFreio, boolean airbag) {
	super(modelo, anoFabricacao);
	this.maxPassageiros = maxPassageiros;
	this.tipoFreio = tipoFreio;
	this.airbag = airbag;
}

public int getMaxPassageiros() {
    return maxPassageiros;
}

public void setMaxPassageiros(int maxPassageiros) {
    this.maxPassageiros = maxPassageiros;
}

public String getTipoFreio() {
    return tipoFreio;
}

public void setTipoFreio(String tipoFreio) {
    this.tipoFreio = tipoFreio;
}

public boolean isAirbag() {
    return airbag;
}

public void setAirbag(boolean airbag) {
    this.airbag = airbag;
}


@Override
public String gerarInsert() {
    return String.format(
        "INSERT INTO Automovel (modelo, ano_fabricacao, max_passageiros, tipo_freio, airbag) VALUES ('%s', %d, %d, '%s', %b);",
        getModelo(), getAnoFabricacao(), maxPassageiros, tipoFreio, airbag
    );
}
}
