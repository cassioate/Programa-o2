package Concretas;

import Abstratas.Figura;
import Enum.Cor;

public class Circulo extends Figura{

	private double raio;
	
	public Circulo(Cor cor, double raio) {
		super(cor);
		this.raio = raio;
	}

	@Override
	public double calculaArea() {
		return Math.PI*(raio*raio);
	}

	@Override
	public double calculaPerimetro() {
		return 2*Math.PI*raio;
	}

	public double getRaio() {
		return raio;
	}

}
