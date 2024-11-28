//class Automovel

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Automovel extends Veiculo{
//atributos da calss 
	private int maxPassageiros;
	private String tipoFreio;
	private boolean airbag;
//construtores e os parametros	
public Automovel(String modelo, int anoFabricacao, int maxPassageiros, String tipoFreio, boolean airbag) {
	super(modelo, anoFabricacao); //super class de herança 
	this.maxPassageiros = maxPassageiros;
	this.tipoFreio = tipoFreio;
	this.airbag = airbag;
}
//getters e setters 
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

//metodo para uso do INSERT 
@Override
public String gerarInsert() {
    return String.format(
        "INSERT INTO Automovel (modelo, ano_fabricacao, max_passageiros, tipo_freio, airbag) VALUES ('%s', %d, %d, '%s', %b);",
        getModelo(), getAnoFabricacao(), maxPassageiros, tipoFreio, airbag
    );

}
public void salvar() {
    String sql = "INSERT INTO Automovel (modelo, ano_fabricacao, max_passageiros, tipo_freio, airbag) VALUES (?, ?, ?, ?, ?)";
    try (Connection conexao = ConexaoBD.conectar();
         PreparedStatement stmt = conexao.prepareStatement(sql)) {

        // Definindo os parâmetros do comando SQL
        stmt.setString(1, getModelo());
        stmt.setInt(2, getAnoFabricacao());
        stmt.setInt(3, this.maxPassageiros);
        stmt.setString(4, this.tipoFreio);
        stmt.setBoolean(5, this.airbag);

        // Executa o comando SQL



stmt.executeUpdate();
        System.out.println("Automóvel salvo com sucesso.");
    } catch (SQLException e) {
        System.err.println("Erro ao salvar Automóvel: " + e.getMessage());
    }
}
}
