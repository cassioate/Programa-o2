package classes;

public class Livro {
	private String titulo;
	private Data publicacao;
	private String autor;
	private boolean emprestado;
	
	public Livro(String titulo, String autor, Data publicacao) {
		this.autor = autor;
		this.titulo = titulo;
		this.publicacao = publicacao;
	}

	public String getTitulo() {
		return titulo;
	}

	public Data getPublicacao() {
		return publicacao;
	}
	
	public boolean isEmprestado() {
		boolean EstaEmprestado = true;
		if (emprestado == true) {
			EstaEmprestado = true;
		} else {
			EstaEmprestado = false;
		}
		return EstaEmprestado;
	}
	
	public void setEmprestado() {
		emprestado = !emprestado;
	}

	public String getAutor() {
		return autor;
	}
}
