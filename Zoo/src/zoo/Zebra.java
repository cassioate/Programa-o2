package zoo;

public class Zebra extends Animal{
		
		public Zebra (String nome, int idade) {
			super(nome, idade);
		}
		
		@Override
		public void emitirSom() {
			System.out.println("Emitiu: Um som que parece de cachorro, mas na verdade é uma Zebra fofinha");
		}
		
		public void fazerAlgo() {
			System.out.println("\nZebra correndo no gás\n");
		}

		/*
		 * Essa seria outra forma de fazer por polimorfismo
		 */
//		public void fazerAlgo() {
//			System.out.println("\nZebra correndo no gás\n");
//		}
	}
