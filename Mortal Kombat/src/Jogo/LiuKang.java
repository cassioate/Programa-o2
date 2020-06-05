package Jogo;

public class LiuKang extends Lutador {
	
	public LiuKang(String nome) {
		super(nome);
	}

	public void chutar (Lutador l) {	
		super.chutar(l);
		l.vida-= 9;
	}
	
	public void lancarMagia (Lutador l) {		
		super.lancarMagia(l);
		l.vida-= 8;
	}
	
	@Override
	public String toString() {
		return "Liu Kang";
	}

}
