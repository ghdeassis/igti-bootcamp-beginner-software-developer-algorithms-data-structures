package entidades;

public abstract class Pessoa {
	protected String nome;
	protected String cpf;
	protected String telefone;
	protected String endereco;
	protected String numero;
	
	public abstract String informaTipo();
	
	public String enderecoCompleto() {
		return endereco + ", " + numero;
	}
	
	public void atualizarDadosPessoais(String nome) {
		this.nome = nome;
	}
	
	public void atualizarDadosPessoais(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
}
