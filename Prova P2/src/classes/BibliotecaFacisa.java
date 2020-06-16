package classes;

import java.util.ArrayList;
import java.util.List;

import excecoes.LivroEmprestadoException;
import excecoes.LivroInexistenteException;

public abstract class BibliotecaFacisa implements Biblioteca{
	private List<Livro> listaDeLivros = new ArrayList<Livro>();

	public BibliotecaFacisa(List<Livro> listaDeLivros) {
		this.listaDeLivros = listaDeLivros;
	}
	
	public void adicionarLivro (String titulo, String autor, Data data) {
		listaDeLivros.add(new Livro(titulo, autor, data));
	}
	
	public List<Livro> listarLivrosDoAutor(String autor){
		ArrayList<Livro> listaDeLivrosDoAutor = new ArrayList<Livro>();
		for (int i = 0 ; i<listaDeLivros.size(); i++) {
			if (listaDeLivros.get(i).getAutor().equals(autor)) {
				listaDeLivrosDoAutor.add(listaDeLivros.get(i));
			}
		}
		return listaDeLivrosDoAutor;
	}
	
	public void removerLivro (String titulo, String autor, Data data) throws LivroInexistenteException {
		boolean excecao = true;
		for (int i = 0 ; i<listaDeLivros.size(); i++) {
			if (listaDeLivros.get(i).getAutor().equals(autor) 
					&& listaDeLivros.get(i).getTitulo().equals(titulo) 
						&& listaDeLivros.get(i).getPublicacao().getDia() == data.getDia()
							&& listaDeLivros.get(i).getPublicacao().getMes() == data.getMes()
								&& listaDeLivros.get(i).getPublicacao().getAno() == data.getAno()) {
									listaDeLivros.remove(i);
									excecao = false;
				}
			}
		if (excecao) {
			throw new LivroInexistenteException();
		}
			
		}	
	
	@Override
	public abstract double fazerEmprestimo (Livro livro, Data dataInicio, Data dataFim) throws LivroEmprestadoException;
	
	public List<Livro> getListaDeLivros() {
		return listaDeLivros;
	}
	
	
}
