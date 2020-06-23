package app;

public class Data {
	
	private int dia;
	private int mes;
	private int ano;
	
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}


	public int getDia() {
		return dia;
	}


	public void setDia(short dia) {
		this.dia = dia;
	}


	public int getMes() {
		return mes;
	}


	public void setMes(short mes) {
		this.mes = mes;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(short ano) {
		this.ano = ano;
	}
	
	public String toString() {
		return dia
				+"/"
				+mes
				+"/"
				+ano;
	}
	
	
}
