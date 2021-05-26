import java.util.ArrayList;

public class BuscaBinaria {
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>();
		/*for (int i = 1; i <= 100; i++) {
			lista.add(i);
		}*/
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);

		int elementoBuscado = 2;
		
		int inicio = 0;
		int fim = lista.size() - 1;
		
		Boolean elementoEncontrado = false;
		
		// 1 2 3 4 5
		while (inicio <= fim) {
			int meio = (inicio + fim) / 2;
			
			if (lista.get(meio) < elementoBuscado) {
				inicio = meio + 1;
			} else if (lista.get(meio) > elementoBuscado) {
				fim = meio - 1;
			} else {
				System.out.println("Elemento encontrado no índice: " + meio);
				elementoEncontrado = true;
				break;
			}
		}
		
		if (!elementoEncontrado) {
			System.out.println("Elemento não encontrado.");
		}
	}

}
