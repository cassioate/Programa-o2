package Jogo;

public class Rayden extends Lutador {

	public Rayden(String nome) {
		super(nome);
	}

	public void lancarMagia (Lutador l) {	
		super.lancarMagia(l);
		l.vida-= 9;
	}
	
	@Override
	public String toString() {
		return "Rayden";
	}
}
