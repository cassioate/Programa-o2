package Jogo;

public class Jax extends Lutador {
	
	public Jax(String nome) {
		super(nome);
	}

	public void socar (Lutador l) {	
		super.socar(l);
		l.vida-= 10;
	}
	
	@Override
	public String toString() {
		return "Jax";
	}
}
