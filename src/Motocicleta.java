
public class Motocicleta extends Veiculo {

	private int cilindradas;
	private double torque;
	
public Motocicleta(String modelo, int anoFabricacao, int cilindradas, double torque ) {
	super (modelo, anoFabricacao);
	this.cilindradas = cilindradas;
	this.torque = torque;
}

public int getCilindradas() {
    return cilindradas;
}

public void setCilindradas(int cilindradas) {
    this.cilindradas = cilindradas;
}

public double getTorque() {
    return torque;
}

public void setTorque(double torque) {
    this.torque = torque;
}
@Override
public String gerarInsert() {
    return String.format(
        "INSERT INTO Motocicleta (modelo, ano_fabricacao, cilindradas, torque) VALUES ('%s', %d, %d, %.2f);",
        getModelo(), getAnoFabricacao(), cilindradas, torque);
}
}
