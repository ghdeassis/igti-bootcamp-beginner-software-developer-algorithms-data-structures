package entidades;

import java.util.Date;

public class Professor extends Pessoa {
	private Date dataAdmissao;
	
	public String informaTipo() {
		return "Meu tipo é Professor";
	}
	
	public Date getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
}
