import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		Stack<String> stackVazia = new Stack<>();
		
		//adicionando elementos na pilha
		stack.add("Livro 1");
		stack.add("Livro 2");
		stack.add("Livro 3");
		stack.add("Livro 4");
		stack.add("Livro 5");
		
		System.out.println(stack);

		//removendo elemento da pilha
		System.out.println("Elemento removido: " + stack.pop()); 
		
		System.out.println(stack);
		
		//verificar elemento no topo da pilha
		System.out.println("Elemento verificado: " + stack.peek());
		
		System.out.println(stack);
		
		//procurar elemento na pilha
		System.out.println(stack.search("Livro 3"));
		
		//verifica se a pilha está vazia
		System.out.println(stack.isEmpty());
		System.out.println(stackVazia.isEmpty());
	}

}
