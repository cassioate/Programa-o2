package zoo;

public class Cachorro extends Animal{
	
	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Emitiu: Au au");
	}
	
	public void fazerAlgo() {
		System.out.println("\nCachorro correndo\n");
	}

	/*
	 * Essa seria outra forma de fazer por polimorfismo
	 */
//	public void fazerAlgo() {
//		System.out.println("\nCachorro correndo\n");
//	}
}
