package zoo;

public class Animal {
	
	protected String nome;
	protected int idade;
	
	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public void emitirSom() {
		System.out.println("Animal emitindo som");
	}
	
	/*
	 * Essa seria outra forma de fazer por polimorfismo
	 */
//	public void fazerAlgo() {
//		System.out.println("Animal emitindo som");
//	}

	public String toString() {
		return "-----------------\n"+"Nome: " +nome+ "\nidade: " +idade+"";
	}
}
