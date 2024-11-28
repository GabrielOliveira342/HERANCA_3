//class Skate

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Skate extends Veiculo {
//atributos da class 	
	private String marca;
	private String cor;
	private String tipoRoda;
//construtores e os parametros 	
public Skate (String modelo, int anoFabricacao, String marca, String cor, String tipoRoda) {
	
	super (modelo, anoFabricacao);//super class herança 
	this.marca = marca;
	this.cor = cor;
	this.tipoRoda = tipoRoda;
}
//getters e setters 
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
//metodo para usar o INSERT 
public String gerarInsert() {
    return String.format("INSERT INTO Skate (modelo, ano_fabricacao, marca, cor, tipoRoda) " +
                         "VALUES ('%s', '%s', '%s', '%s');",
                          getModelo(), getAnoFabricacao(), marca, cor, tipoRoda);
}

public void salvar() {
    String sql = "INSERT INTO Skate (modelo, ano_fabricacao, marca, cor, tipoRoda) VALUES (?, ?, ?, ?, ?)";
    try (Connection conexao = ConexaoBD.conectar();
         PreparedStatement stmt = conexao.prepareStatement(sql)) {

        // Definindo os parâmetros do comando SQL
        stmt.setString(1, getModelo());
        stmt.setInt(2, getAnoFabricacao());
        stmt.setString(3, this.marca);
        stmt.setString(4, this.cor);
        stmt.setString(5, this.tipoRoda);

        // Executa o comando SQL

stmt.executeUpdate();
        System.out.println("Skate salvo com sucesso.");
    } catch (SQLException e) {
        System.err.println("Erro ao salvar Skate: " + e.getMessage());
    }
}
}
