package testProjeto;

public class Cliente {

	private String Name;
	private Double cpf;
	private String endereco;
	private int  idade;
	public Cliente() {
		super();
		this.Name = Name;
		this.cpf = cpf;
		this.endereco = endereco;
		this.idade = idade;
	}
	protected String getName() {
		return Name;
	}
	protected void setName(String name) {
		this.Name = name;
	}
	protected Double getCpf() {
		return cpf;
	}
	protected void setCpf(Double cpf) {
		this.cpf = cpf;
	}
	protected String getEndereco() {
		return endereco;
	}
	protected void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	protected int getIdade() {
		return idade;
	}
	protected void setIdade(int idade) {
		this.idade = idade;
	}
	

}
