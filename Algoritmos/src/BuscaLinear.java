import java.util.ArrayList;

public class BuscaLinear {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>();
		lista.add(6);
		lista.add(7);
		lista.add(4);
		lista.add(5);
		lista.add(2);
		
		System.out.println(lista);

		Integer elementoBuscado = 41;
		Boolean elementoEncontrado = false;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).equals(elementoBuscado)) {
				System.out.println("O elemento buscado está no índice: " + i);
				elementoEncontrado = true;
				break;
			}
		}
		if (!elementoEncontrado) {
			System.out.println("O elemento não foi encontrado.");
		}
	}

}
