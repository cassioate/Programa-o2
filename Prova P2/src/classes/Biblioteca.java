package classes;

import java.util.List;

import excecoes.LivroEmprestadoException;
import excecoes.LivroInexistenteException;

public interface Biblioteca {
	
	public void adicionarLivro (String titulo, String autor, Data data);
		
	public List<Livro> listarLivrosDoAutor(String autor);
	
	public void removerLivro (String titulo, String autor, Data data) throws LivroInexistenteException;
	
	public double fazerEmprestimo (Livro livro, Data dataInicio, Data dataFim) throws LivroEmprestadoException;
	
}
