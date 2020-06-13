package app;

public enum Proteina {
	PICANHA(20), MAMINHA(15), FRANGO(15), LINGUICA(10), PEIXE(25), OVO(4);
	
	private double valor;
	
	private Proteina(double valor) {
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}
	
}
