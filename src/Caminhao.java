//calss Caminhao

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Caminhao extends Veiculo {
//atributos da class 	
	private int eixos; 
	private double pesoBruto;
	
//construtores e os parametros 
public Caminhao (String modelo, int anoFabricacao, int eixos, double pesoBruto) {
	
	super (modelo, anoFabricacao); //super class da herança 
	this.eixos = eixos;
	this.pesoBruto = pesoBruto;
}
//getters e setters 
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
//metodo para usar o INSERT 
@Override
public String gerarInsert() {
    return String.format(
        "INSERT INTO Caminhao (modelo, ano_fabricacao, eixos, peso_bruto) VALUES ('%s', %d, %d, %.2f);",
        getModelo(), getAnoFabricacao(), eixos, pesoBruto);
}


public void salvar() {
    String sql = "INSERT INTO Caminhao (modelo, ano_fabricacao, eixos, peso_bruto) VALUES (?, ?, ?, ?)";
    try (Connection conexao = ConexaoBD.conectar();
         PreparedStatement stmt = conexao.prepareStatement(sql)) {

        // Definindo os parâmetros do comando SQL
        stmt.setString(1, getModelo());
        stmt.setInt(2, getAnoFabricacao());
        stmt.setInt(3, this.eixos);
        stmt.setDouble(4, this.pesoBruto);

        // Executa o comando SQL

stmt.executeUpdate();
        System.out.println("Caminhão salvo com sucesso.");
    } catch (SQLException e) {
        System.err.println("Erro ao salvar Caminhão: " + e.getMessage());
    }
}
}
