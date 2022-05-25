package testProjeto;

public class Aluguel {


	private String automovel;
	private Double dataAluguel;
	private double diasAlug;
	
	
	public Aluguel() {
		super();
		this.automovel = automovel;
		this.dataAluguel = dataAluguel;
		this.diasAlug = diasAlug;
	}


	protected String getAutomovel() {
		return automovel;
	}


	protected void setAutomovel(String automovel) {
		this.automovel = automovel;
	}


	protected Double getDataAluguel() {
		return dataAluguel;
	}


	protected void setDataAluguel(Double dataAluguel) {
		this.dataAluguel = dataAluguel;
	}


	protected double getDiasAlug() {
		return diasAlug;
	}


	protected void setDiasAlug(double diasAlug) {
		this.diasAlug = diasAlug;
	}


	public  double aluguelSimples() {
		return 200 * diasAlug;
	} 
	public  double aluguelLuxo() {
		return (200 *0.30)+ 200 * diasAlug;
	
	}
}
