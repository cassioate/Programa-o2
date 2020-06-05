package Jogo;

public class SubZero extends Lutador {

	public SubZero(String nome) {
		super(nome);
	}

	public void lancarMagia (Lutador l) {
		super.lancarMagia(l);
		l.vida-= 8;
	}
	
	@Override
	public String toString() {
		return "Sub-Zero";
	}

}
