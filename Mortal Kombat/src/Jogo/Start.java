package Jogo;

public class Start {

	public static void main(String[] args) {

		
		Lutador lutador1 = new LiuKang("Cássio");
		Lutador lutador2 = new LiuKang("Emanuel");
		
		MortalKombat jogo = new MortalKombat(lutador1, lutador2);
		
		jogo.fight();

	}

}
