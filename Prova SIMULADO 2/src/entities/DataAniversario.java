package entities;

public class DataAniversario {

	private int dia;
	private int mes;
	
	public int getDia() {
		return dia;
	}


	public void setDia(int dia) {
		this.dia = dia;
	}


	public int getMes() {
		return mes;
	}


	public void setMes(int mes) {
		this.mes = mes;
	}


	public DataAniversario(int dia, int mes){
		this.dia = dia;
		this.mes = mes;
	}
		
	public String toString(){
		return this.dia+"/"+this.mes;
	}

}
