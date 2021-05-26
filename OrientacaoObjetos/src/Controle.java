import java.util.ArrayList;

import entidades.Aluno;
import entidades.Caminhao;
import entidades.Carro;
//import entidades.AlunoEnsinoMedio;
import entidades.Diretor;
import entidades.MeioLocomocao;
import entidades.Pessoa;
import entidades.Professor;

public class Controle {
	private ArrayList<Aluno> alunos = new ArrayList<>();
	private ArrayList<Diretor> diretores = new ArrayList<>();
	private ArrayList<Professor> professores = new ArrayList<>();
	private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	public void iniciar() {
		Aluno aluno1 = new Aluno();
		aluno1.setNome("João Silva");
		aluno1.setCpf("12345678999");
		aluno1.setTelefone("(31)98988-9889");
		aluno1.setEndereco("Rua X");
		aluno1.setNumero("10");
		aluno1.setMatricula(123456);
		
		Aluno aluno2 = new Aluno("Maria Sousa", "01234657899", 
				"(31)98899-4545", "Rua Y", 666587);
		
		Aluno aluno3 = new Aluno("José Rocha");
		aluno3.setCpf("3232233232");
		aluno3.setTelefone("(31)98988-1544");
		aluno3.setEndereco("Rua XY");
		aluno3.setMatricula(13213232);
		
		alunos.add(aluno1);
		alunos.add(aluno2);
		alunos.add(aluno3);
		
		Professor professor1 = new Professor();
		professor1.setNome("Henrique Souza");
		
		Diretor diretor1 = new Diretor();
		diretor1.setNome("Genivaldo Silva");
		
		pessoas.add(aluno1);
		pessoas.add(professor1);
		pessoas.add(diretor1);	
		
		System.out.println(aluno1.enderecoCompleto());
		
		System.out.println(aluno1.informaTipo());
		System.out.println(professor1.informaTipo());
		System.out.println(diretor1.informaTipo());
		
		aluno1.atualizarDadosPessoais("Nome de Teste");
		aluno1.atualizarDadosPessoais("Nome de Teste 2", "123456789");
		
		System.out.println(aluno1.getNome());
		
		//AlunoEnsinoMedio alunoEnsinoMedio = new AlunoEnsinoMedio();
		
		ArrayList<MeioLocomocao> lista = new ArrayList<>();
		Carro carro = new Carro();		
		Caminhao caminhao = new Caminhao();	
		
		carro.acelerar();		
		caminhao.acelerar();
		
		lista.add(carro);
		lista.add(caminhao);
	}
}
