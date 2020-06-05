package Jogo;

public class Sonia extends Lutador {
	
	public Sonia(String nome) {
		super(nome);
	}

	public void socar (Lutador l) {	
		super.socar(l);
		l.vida-= 8;
	}
	
	public void chutar (Lutador l) {	
		super.chutar(l);
		l.vida-= 8;
	}
	
	@Override
	public String toString() {
		return "Sonia";
	}

}
