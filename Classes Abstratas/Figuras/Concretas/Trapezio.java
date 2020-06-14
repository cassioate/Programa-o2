package Concretas;

import Abstratas.Quadilatero;
import Enum.Cor;

public class Trapezio extends Quadilatero{
	
	private double altura;

	public Trapezio(Cor cor, double ladoBmaior, double ladoBmenor, double lado3, double lado4, double altura) {
		super(cor, ladoBmaior, ladoBmenor, lado3, lado4);
		this.altura = altura;
	}

	@Override
	public double calculaArea() {
		return ((getLado1()+getLado2()) * altura) / 2 ;
	}

	@Override
	public double calculaPerimetro() {
		return getLado1()+getLado2()+getLado3()+getLado4();
	}

	public double getAltura() {
		return altura;
	}

}
