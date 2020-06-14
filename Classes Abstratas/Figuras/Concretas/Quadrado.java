package Concretas;

import Abstratas.Quadilatero;
import Enum.Cor;

public class Quadrado extends Quadilatero{

	public Quadrado(Cor cor, double lado1, double lado2, double lado3, double lado4) {
		super(cor, lado1,lado2,lado3,lado4);
	}

	@Override
	public double calculaArea() {
		return getLado1()*getLado1();
	}

	@Override
	public double calculaPerimetro() {
		return getLado1()*4;
	}
	
}
