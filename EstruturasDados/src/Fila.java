import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		//adicionando elementos na fila
		fila.add("Pessoa 1");
		fila.add("Pessoa 2");
		fila.add("Pessoa 3");
		fila.add("Pessoa 4");
		fila.add("Pessoa 5");
		
		System.out.println(fila);
		
		//removendo elemento da fila
		System.out.println("Elemento removido: " + fila.remove());
		
		System.out.println(fila);
		
		//verificar primeiro elemento da fila
		System.out.println("Elemento verificado: " + fila.peek());
		
		System.out.println(fila);
		
		//procurar elemento na fila
		System.out.println(fila.contains("Pessoa 3"));
		
		//retornar tamanho da fila
		System.out.println("Tamanho: " + fila.size());
		
		//remove todos os elementos da fila
		//fila.clear();		
		
		//verifica se a fila esta vazia		
		System.out.println(fila.isEmpty());
	}

}
