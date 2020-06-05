package zoo;

public class Preguica extends Animal {

	public Preguica (String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Emitiu: ZZzzzzZZZZzzzz");
	}
	
	public void fazerAlgo() {
		System.out.println("\nNada acontece\n");
	}
	
	/*
	 * Essa seria outra forma de fazer por polimorfismo
	 */
//	public void fazerAlgo() {
//		System.out.println("\nNada acontece\n");
//	}
}
