package entidades;

import java.util.ArrayList;

public class Aluno extends Pessoa {	
	private Integer matricula;
	private ArrayList<Nota> notas;

	public Aluno() {
		this.notas = new ArrayList<>();		
	}
			
	public Aluno(String nome, Integer matricula) {
		this.nome = nome;
		this.matricula = matricula;
		this.notas = new ArrayList<>();
	}
	
	public String toString() {
		return nome + " - " + matricula;
	}
	
	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}
}
