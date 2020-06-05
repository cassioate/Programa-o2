package zoo;

public class Cavalo extends Animal {

	public Cavalo (String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Emitiu: Innnririririri");
	}
	

	public void fazerAlgo() {
		System.out.println("\nCavalo Trotando\n");
	}
	
	/*
	 * Essa seria outra forma de fazer por polimorfismo
	 */
//	public void fazerAlgo() {
//		System.out.println("\nCavalo Trotando\n");
//	}
}
