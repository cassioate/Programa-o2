package excecoes;

public class LivroEmprestadoException extends Exception {
	public LivroEmprestadoException () {
		super("Livro j� emprestado!");
	}
}
