import java.util.ArrayList;
import java.util.Arrays;

public class Matriz {
	public static void main(String[] args) {
		ArrayList<ArrayList<Double>> matriz = 
				new ArrayList<ArrayList<Double>>();
		
		ArrayList<Double> linha1 = new ArrayList<>();
		linha1.add(8.0);
		linha1.add(10.0);
		linha1.add(7.0);
		linha1.add(6.5);		
		matriz.add(linha1);
		
		ArrayList<Double> linha2 = new ArrayList<Double>(Arrays.asList(7.0, 9.0, 5.0, 4.0));
		ArrayList<Double> linha3 = new ArrayList<Double>(Arrays.asList(4.0, 8.0, 6.0, 9.0));
		
		matriz.add(linha2);
		matriz.add(linha3);
				
		System.out.println(matriz);
		
		//acessando elemento em específico
		System.out.println(matriz.get(1).get(2));
		
		//alterando elemento na matriz
		matriz.get(1).set(2, 10.5);
		
		System.out.println(matriz.get(1).get(2));
		
		for (int i = 0; i < matriz.size(); i++) {
			ArrayList<Double> linha = matriz.get(i);
			System.out.println(linha);
			
			for (int j = 0; j < linha.size(); j++) {
				System.out.println(linha.get(j));
			}
		}
	}
}
