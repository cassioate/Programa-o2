package app;

public enum Carboidrato {
	FEIJAO(2), ARROZ(1.5), PURE(1.5), BATATA(1), MACARRAO(2);
	
	private double valor;
	
	private Carboidrato(double valor) {
		this.valor = valor;		
	}

	public double getValor() {
		return valor;
	}
	
}
