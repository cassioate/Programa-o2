package Jogo;

import java.util.Random;

public class MortalKombat {

	public Lutador player1;
	public Lutador player2;
	
	public MortalKombat(Lutador player1, Lutador player2) {
		this.player1 = player1;
		this.player2 = player2;
	}
	
	public void fight () {
		while (player1.getVida() > 0 && player2.getVida() > 0) {
			Lutador lutadorDaVez = null;
			Lutador lutadorOponente = null;
			Random rand = new Random();
			int sorteioDoLutador = rand.nextInt(2);
			
				if(sorteioDoLutador == 1) {
					lutadorDaVez = player1;
					lutadorOponente = player2;
				} else {
					lutadorDaVez = player2;
					lutadorOponente = player1;
				}
	
			Random rand2 = new Random();
			int sorteioDoGolpe = rand2.nextInt(4);
			
			switch(sorteioDoGolpe){
            case 0:
            	lutadorDaVez.atirar(lutadorOponente);
                System.out.println("\n"+lutadorDaVez+" Atirou na cara de "+lutadorOponente);
                break;
            case 1:
            	lutadorDaVez.chutar(lutadorOponente);
            	System.out.println("\n"+lutadorDaVez+" Chutou a boca de "+lutadorOponente);
                break;
            case 2:
            	lutadorDaVez.lancarMagia(lutadorOponente);
            	System.out.println("\n"+lutadorDaVez+" Lançou aquela velha magia em "+lutadorOponente);
                break;
            case 3:
            	lutadorDaVez.socar(lutadorOponente);
            	System.out.println("\n"+lutadorDaVez+" Deu um murrão em "+lutadorOponente);
                break;
			}
			
			System.out.println("O HP de "+player1+ " é " +player1.getVida());
			System.out.println("O HP de "+player2+ " é " +player2.getVida());
			
			if(lutadorOponente.getVida() <= 0) {
				System.out.println("\n\n"+ "--------------------------\n"+"O vencedor foi: "+lutadorDaVez+"!" + "\nDo jogador: "+lutadorDaVez.nome +".\n--------------------------\n");
			}
//			if(lutadorDaVez.getVida() <= 0) {
//				System.out.println("\n\n\n"+ "--------------\n"+"O vencedor foi: "+lutadorOponente+ "--------------\n");
//			}
			
		}
		
		
	}
}
