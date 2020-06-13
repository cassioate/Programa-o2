package app;

public enum Tamanho {
	
	PEQUENO(0), MEDIO(2), GRANDE(2.8);
	
	private double tamanho;
	
	private Tamanho (double tamanho) {
		this.tamanho = tamanho;

	}
	
	public double getTamanho() {
		return tamanho;
	}
}
