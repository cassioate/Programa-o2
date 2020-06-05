package zoo;

	public class Leao extends Animal{
		
		public Leao (String nome, int idade) {
			super(nome, idade);
		}
		
		@Override
		public void emitirSom() {
			System.out.println("Emitiu: roar! grraurrr! brrrum!");
		}
		
		public void fazerAlgo() {
			System.out.println("\nEle só olha, e você é quem corre!\n");
		}
	
		/*
		 * Essa seria outra forma de fazer por polimorfismo
		 */
//		public void fazerAlgo() {
//			System.out.println("\nEle só olha, e você é quem corre!\n");
//		}
	}
