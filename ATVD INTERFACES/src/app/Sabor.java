package app;

public enum Sabor {
	GUARANA(5), COCA(5), JARRADELARANJA(10), SUCODEUVA(6), SUCODELIMAO(4), SODA(5), CERVEJA(3.5);
	
	private double valor;
	
	private Sabor(double valor) {
		this.valor = valor;
	}
	
	public double getSabor() {
		return valor;
	}

	public double getValor() {
		return valor;
	}
	
}
