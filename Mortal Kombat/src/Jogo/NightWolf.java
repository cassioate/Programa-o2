package Jogo;

public class NightWolf extends Lutador {
	
	public NightWolf(String nome) {
		super(nome);
	}

	public void atirar (Lutador l) {	
		super.atirar(l);
		l.vida-= 5;
	}
	
	public void lancarMagia (Lutador l) {		
		super.lancarMagia(l);
		l.vida-= 6;
	}

	@Override
	public String toString() {
		return "NightWolf";
	}
}