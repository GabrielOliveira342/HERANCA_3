//class Bicicleta 

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Bicicleta extends Veiculo {
//atributos da class 
	private String marca;
	private String cor; 
	private String material;
	private int marchas;
	private boolean amortecedor;
//construtores e os parametros 
public Bicicleta (String modelo, int anoFabricacao, String marca, String cor, String material, int marchas, boolean amortecedor) {
	 super (modelo, anoFabricacao); //super class da herança 
	 this.marca = marca;
     this.cor = cor;
     this.material = material;
     this.marchas = marchas;
     this.amortecedor = amortecedor;
 }
 
// getters e setter
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

 public String getMaterial() {
     return material;
 }

 public void setMaterial(String material) {
     this.material = material;
 }

 public int getMarchas() {
     return marchas;
 }

 public void setMarchas(int marchas) {
     this.marchas = marchas;
 }

 public boolean isAmortecedor() {
     return amortecedor;
 }

 public void setAmortecedor(boolean amortecedor) {
     this.amortecedor = amortecedor;
 }
 //metodo para usar o INSERT
 @Override
 public String gerarInsert() {
     return String.format("INSERT INTO Bicicleta (modelo, ano_fabricacao marca, cor, material, marchas, amortecedor) " +
                          "VALUES ('%s', '%s', '%s', '%s', %d, %b);",
                          getModelo(), getAnoFabricacao(), cor, material, marchas, amortecedor);
 }

 public void salvar() {
     String sql = "INSERT INTO Bicicleta (modelo, ano_fabricacao, marca, cor, material, marchas, amortecedor) " +
                  "VALUES (?, ?, ?, ?, ?, ?, ?)";
     try (Connection conexao = ConexaoBD.conectar();
          PreparedStatement stmt = conexao.prepareStatement(sql)) {

         // Definindo os parâmetros do comando SQL
         stmt.setString(1, getModelo());
         stmt.setInt(2, getAnoFabricacao());
         stmt.setString(3, this.marca);
         stmt.setString(4, this.cor);
         stmt.setString(5, this.material);
         stmt.setInt(6, this.marchas);
         stmt.setBoolean(7, this.amortecedor);

         // Executa o comando SQL

stmt.executeUpdate();
         System.out.println("Bicicleta salva com sucesso.");
     } catch (SQLException e) {
         System.err.println("Erro ao salvar Bicicleta: " + e.getMessage());
     }
 }
}	

