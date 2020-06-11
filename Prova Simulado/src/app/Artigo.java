package app;

public class Artigo {
	private Autor autor;
	private int ano;
	private String titulo;
	
	public Artigo(Autor autor, int ano, String titulo) throws AnoInvalidoException, IllegalArgumentException{
		this.autor = autor;
		
		if (ano <= 2020) {
			this.ano = ano;
		} else {
			throw new AnoInvalidoException();
		
		} if (titulo == "" || titulo.length() > 50) {
			throw new IllegalArgumentException();
		} else {
			this.titulo = titulo;
		} 
	}
	
	public Autor getAutor() {
		return autor;
	}
	
	public int getAno() {
		return ano;
	}
	
	public String getTitulo() {
		return titulo;
	}
	

}
