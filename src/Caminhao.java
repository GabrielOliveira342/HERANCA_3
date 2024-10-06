
public class Caminhao extends Veiculo {
	
	private int eixos; 
	private double pesoBruto;
	
	
public Caminhao (String modelo, int anoFabricacao, int eixos, double pesoBruto) {
	super (modelo, anoFabricacao);
	this.eixos = eixos;
	this.pesoBruto = pesoBruto;
}
public int getEixos() {
    return eixos;
}

public void setEixos(int eixos) {
    this.eixos = eixos;
}

public double getPesoBruto() {
    return pesoBruto;
}

public void setPesoBruto(double pesoBruto) {
    this.pesoBruto = pesoBruto;
}
@Override
public String gerarInsert() {
    return String.format(
        "INSERT INTO Caminhao (modelo, ano_fabricacao, eixos, peso_bruto) VALUES ('%s', %d, %d, %.2f);",
        getModelo(), getAnoFabricacao(), eixos, pesoBruto);
}
}
