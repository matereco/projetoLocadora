package locadora;

public class automoveis {
	private String chassi;
	private String placa;
	private String modelo;
	private String cor;
	private int NumFabri;
	private double valorDia;
	
	public automoveis(String chassi, String placa, int numFabri, String modelo, String cor, double valorDia) {
		this.chassi = chassi;
		this.placa = placa;
		NumFabri = numFabri;
		this.modelo = modelo;
		this.cor = cor;
		this.valorDia = valorDia;
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
