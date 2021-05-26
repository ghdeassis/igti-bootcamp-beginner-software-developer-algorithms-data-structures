package jogovelha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JogoVelha {
	private Scanner scanner = new Scanner(System.in);
	private ArrayList<ArrayList<String>> matriz = new ArrayList<ArrayList<String>>();
	
	private void imprimeMatriz() {
		for (int i = 0; i < matriz.size(); i++) {
			System.out.println(matriz.get(i));
		}
	}
	
	private String solicitarJogada() {
		System.out.println("jogada solicitada");
		imprimeMatriz();
		return scanner.nextLine();
	}
	
	public void iniciar() {
		ArrayList<String> linha1 = new ArrayList<String>(Arrays.asList("_", "_", "_"));
		ArrayList<String> linha2 = new ArrayList<String>(Arrays.asList("_", "_", "_"));
		ArrayList<String> linha3 = new ArrayList<String>(Arrays.asList("_", "_", "_"));
		
		matriz.add(linha1);
		matriz.add(linha2);
		matriz.add(linha3);
		
		Boolean vezJogador1 = true;
		Boolean houveVencedor = false;
		for (int i = 0; i < 9; i++) {
			String jogada = solicitarJogada();
			
			Integer linha = Integer.valueOf(jogada.split("-")[0]);
			Integer coluna = Integer.valueOf(jogada.split("-")[1]);
			
			if (vezJogador1) {				
				matriz.get(linha).set(coluna, "X");
			} else {
				matriz.get(linha).set(coluna, "O");
			}
			
			if (verificarVencedor()) {
				houveVencedor = true;
				String vencedor = vezJogador1 ? "1" : "2";
				System.out.println("O jogador " + vencedor + " venceu!");
				break;
			}
			
			vezJogador1 = !vezJogador1;
		}
		if (!houveVencedor) {
			imprimeMatriz();
			System.out.println("Não houve vencedor.");
		}
	}
	
	private Boolean verificarVencedor() {
		for (int i = 0; i < 3; i++) {
			//vitoria na horizontal
			String horizontal1 = matriz.get(i).get(0);
			String horizontal2 = matriz.get(i).get(1);
			String horizontal3 = matriz.get(i).get(2);
			
			if (!horizontal1.equals("_") 
					&& horizontal1.equals(horizontal2) 
					&& horizontal1.equals(horizontal3)) {
				return true;
			}
			
			//vitoria na vertical
			String vertical1 = matriz.get(0).get(i);
			String vertical2 = matriz.get(1).get(i);
			String vertical3 = matriz.get(2).get(i);
			if (!vertical1.equals("_")
					&& vertical1.equals(vertical2)
					&& vertical1.equals(vertical3)) {
				return true;
			}
		}
		
		String diagonal1 = matriz.get(0).get(0);
		String diagonal2 = matriz.get(1).get(1);
		String diagonal3 = matriz.get(2).get(2);
		
		if (!diagonal1.equals("_")
				&& diagonal1.equals(diagonal2)
				&& diagonal1.equals(diagonal3)) {
			return true;
		}
		
		String diagonalInvertida1 = matriz.get(0).get(2);
		String diagonalInvertida2 = matriz.get(1).get(1);
		String diagonalInvertida3 = matriz.get(2).get(0);
		
		if (!diagonalInvertida1.equals("_")
				&& diagonalInvertida1.equals(diagonalInvertida2)
				&& diagonalInvertida1.equals(diagonalInvertida3)) {
			return true;
		}
		
		return false;
	}
}
