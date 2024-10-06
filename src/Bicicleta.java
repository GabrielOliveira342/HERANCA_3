
public class Bicicleta extends Veiculo {


	private String marca;
	private String cor; 
	private String material;
	private int marchas;
	private boolean amortecedor;

public Bicicleta (String modelo, int anoFabricacao, String marca, String cor, String material, int marchas, boolean amortecedor) {
	 super (modelo, anoFabricacao);
	 this.marca = marca;
     this.cor = cor;
     this.material = material;
     this.marchas = marchas;
     this.amortecedor = amortecedor;
 }

 // Getters e Setter

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
 @Override
 public String gerarInsert() {
     return String.format("INSERT INTO Bicicleta (modelo, ano_fabricacao marca, cor, material, marchas, amortecedor) " +
                          "VALUES ('%s', '%s', '%s', '%s', %d, %b);",
                          getModelo(), getAnoFabricacao(), cor, material, marchas, amortecedor);
 }
}	

