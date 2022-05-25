package testProjeto;

public class AutomoveisInfo {
	
	private String chassi;
	private String placa;
	private String modelo;
	private String cor;
	private int NumFabri;
	private double valorDia;
	private String marca;
	
	
	public AutomoveisInfo(String chassi, String placa, int numFabri, String modelo, String cor,String marca, double valorDia) {
		this.chassi = chassi;
		this.placa = placa;
		this.NumFabri = numFabri;
		this.modelo = modelo;
		this.cor = cor;
		this.valorDia = valorDia;
		this.marca = marca;
	}
	
	protected String getMarca() {
		return marca;
	}

	protected void setMarca(String marca) {
		this.marca = marca;
	}

	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getNumFabri() {
		return NumFabri;
	}
	public void setNumFabri(int numFabri) {
		NumFabri = numFabri;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getValorDia() {
		return valorDia;
	}
	public void setValorDia(double valorDia) {
		this.valorDia = valorDia;
	}
	

}
