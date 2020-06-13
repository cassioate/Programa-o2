package app;

public class Bebida implements Item{

	private Tamanho tamanho;
	private Sabor sabor;
	
	public Bebida(Tamanho tamanho, Sabor sabor) {
		this.tamanho = tamanho;
		this.sabor = sabor;
	}

	public Tamanho getTamanho() {
		return tamanho;
	}

	public Sabor getSabor() {
		return sabor;
	}

	@Override
	public double getPreco() {
		return sabor.getValor();
	}

	@Override
	public String getDescricao() {
		return "Bebida: " + sabor + " de tamanho: " + tamanho;
	}

}
