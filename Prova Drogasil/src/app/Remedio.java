package app;

public class Remedio {
	
	private double preco;
	private String nome, bula;
	private Data dataVencimento;
	
	
	public Remedio(double preco, String nome, String bula, Data dataVencimento) {
		this.preco = preco;
		this.nome = nome;
		this.bula = bula;
		this.dataVencimento = dataVencimento;
	}
	
	
	
	
	public double getPreco() {
		return preco;
	}
	public String getNome() {
		return nome;
	}
	public String getBula() {
		return bula;
	}
	public Data getDataVencimento() {
		return dataVencimento;
	}
	
	public String toString() {
		return "\nO pre�o �: "+	preco
				+"\nO nome �:" + nome 
				+"\nO vencimento �: " +dataVencimento
				+"\nA bula �: "	+bula+"\n";

	}
	

}
