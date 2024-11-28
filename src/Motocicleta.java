//class Motocicleta 

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Motocicleta extends Veiculo {
//atributos da class 
	private int cilindradas;
	private double torque;
//construtores e os parametros 	
public Motocicleta(String modelo, int anoFabricacao, int cilindradas, double torque ) {
	super (modelo, anoFabricacao); //super class herança 
	this.cilindradas = cilindradas;
	this.torque = torque;
}
//getters e setters 
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
//metodo para usar o INSERT
@Override
public String gerarInsert() {
    return String.format(
        "INSERT INTO Motocicleta (modelo, ano_fabricacao, cilindradas, torque) VALUES ('%s', %d, %d, %.2f);",
        getModelo(), getAnoFabricacao(), cilindradas, torque);
}

public void salvar() {
    String sql = "INSERT INTO Motocicleta (modelo, ano_fabricacao, cilindradas, torque) VALUES (?, ?, ?, ?)";
    try (Connection conexao = ConexaoBD.conectar();
         PreparedStatement stmt = conexao.prepareStatement(sql)) {

        // Definindo os parâmetros do comando SQL
        stmt.setString(1, getModelo());
        stmt.setInt(2, getAnoFabricacao());
        stmt.setInt(3, this.cilindradas);
        stmt.setDouble(4, this.torque);

        // Executa o comando SQL

stmt.executeUpdate();
        System.out.println("Motocicleta salva com sucesso.");
    } catch (SQLException e) {
        System.err.println("Erro ao salvar Motocicleta: " + e.getMessage());
    }
}
}
