package Abstratas;

import Enum.Cor;

public abstract class Figura {
	
	protected Cor cor;
	
	public Figura(Cor cor) {
		this.cor = cor;
	}
	
	public abstract double calculaArea();
	public abstract double calculaPerimetro();
	
	
}
