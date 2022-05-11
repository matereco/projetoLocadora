package locadora;

public class aluguel {
	private String automovel;
	private String dataAlug;
	private int diasAlug;
	private double valorTotal;
	
	public aluguel(String automovel, String dataAlug, int diasAlug, double valorTotal) {
		this.automovel = automovel;
		this.dataAlug = dataAlug;
		this.diasAlug = diasAlug;
		this.valorTotal = valorTotal;
	}
	public String getAutomovel() {
		return automovel;
	}
	public void setAutomovel(String automovel) {
		this.automovel = automovel;
	}
	public String getDataAlug() {
		return dataAlug;
	}
	public void setDataAlug(String dataAlug) {
		this.dataAlug = dataAlug;
	}
	public int getDiasAlug() {
		return diasAlug;
	}
	public void setDiasAlug(int diasAlug) {
		this.diasAlug = diasAlug;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	
	
}
