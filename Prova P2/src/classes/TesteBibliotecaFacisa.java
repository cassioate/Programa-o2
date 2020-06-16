package classes;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import excecoes.LivroEmprestadoException;
import excecoes.LivroInexistenteException;

public class TesteBibliotecaFacisa {
	
	private BibliotecaFacisa biblioteca;
	private BibliotecaFacisa bibliotecaPos;
	private Livro livro1;
	private Livro livro2;
	private Livro livro3;
	private Livro livro4;

	@Before
	public void setUp() throws Exception {
		ArrayList<Livro> livros = new ArrayList<Livro>();
		livro1 = new Livro("Pequeno Principe", "Cássio", new Data(10, 3, 2020));
		livro2 = new Livro("Grande Principe", "Alice", new Data(10, 9, 2000));
		livro3 = new Livro("Principe", "Cássio", new Data(10, 2, 1950));
		livro4 = new Livro("Nem Grande nem Pequeno Principe", "José", new Data(15, 1, 1850));
		livros.add(livro1);
		livros.add(livro2);
		livros.add(livro3);
		livros.add(livro4);
		biblioteca = new BibliotecaFacisaGraduacao(livros);
		bibliotecaPos = new BibliotecaFacisaPosGraduacao(livros);
	}

	@Test
	public void testAdcBibliotecaFacisa() {
		assertEquals(4, biblioteca.getListaDeLivros().size());
		biblioteca.adicionarLivro("Eu e tu", "Maria", new Data(10, 2, 2010));
		assertEquals(5, biblioteca.getListaDeLivros().size());
	}
	
	@Test
	public void testListarLivros() {
		ArrayList<Livro> livrosAutor = new ArrayList<Livro>();
		livrosAutor.add(livro1);
		livrosAutor.add(livro3);
		assertEquals(livrosAutor, biblioteca.listarLivrosDoAutor("Cássio"));
	}
	
	@Test
	public void testListarLivrosExistente() throws LivroInexistenteException {
		assertEquals(4, biblioteca.getListaDeLivros().size());
		biblioteca.removerLivro("Pequeno Principe", "Cássio", new Data(10, 3, 2020));
		assertEquals(3, biblioteca.getListaDeLivros().size());
		biblioteca.removerLivro("Nem Grande nem Pequeno Principe", "José", new Data(15, 1, 1850));
		assertEquals(2, biblioteca.getListaDeLivros().size());
	}
	
	@Test (expected = LivroInexistenteException.class)
	public void testListarLivrosInexistente() throws LivroInexistenteException {
		biblioteca.removerLivro("LaraLerie", "Cássio", new Data(10, 3, 2020));
	}
	
	@Test
	public void testEmprestimoExistente() throws LivroInexistenteException, LivroEmprestadoException {
		biblioteca.fazerEmprestimo(livro1, new Data(15, 1, 1849), new Data(15, 1, 1850));
		assertEquals(livro1.isEmprestado(), true);
	}
	
	@Test(expected = LivroEmprestadoException.class)
	public void testEmprestimoInexistente() throws LivroInexistenteException, LivroEmprestadoException {
		assertEquals(livro1.isEmprestado(), false);
		biblioteca.fazerEmprestimo(livro1, new Data(15, 1, 1849), new Data(15, 1, 1850));
		biblioteca.fazerEmprestimo(livro1, new Data(15, 1, 1849), new Data(15, 1, 1850));
		assertEquals(livro1.isEmprestado(), true);
	}
	

}
