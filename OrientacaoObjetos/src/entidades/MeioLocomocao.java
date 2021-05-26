package entidades;

public interface MeioLocomocao {
	public default void acelerar() {
		System.out.println("Implementação default do acelerar");
	}
	public void frear();	
}
