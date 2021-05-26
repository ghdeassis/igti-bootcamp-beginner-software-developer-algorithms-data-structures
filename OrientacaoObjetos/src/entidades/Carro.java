package entidades;

public class Carro implements MeioLocomocao {
	private String modelo;
	private String cor;
	private Integer ano;
	private Integer velocidade;
	
	public Carro() {
		velocidade = 0;
	}
	
	@Override
	public void acelerar() {
		velocidade = velocidade + 5;
		System.out.println("Aceleração do Carro");
	}
	
	@Override
	public void frear() {
		if (velocidade > 0) {
			velocidade = velocidade - 5;			
		}		
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
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(Integer velocidade) {
		this.velocidade = velocidade;
	}
	
}
