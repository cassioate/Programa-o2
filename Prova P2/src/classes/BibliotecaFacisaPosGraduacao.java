package classes;

import java.util.List;

import excecoes.LivroEmprestadoException;

public class BibliotecaFacisaPosGraduacao extends BibliotecaFacisa{

	public BibliotecaFacisaPosGraduacao(List<Livro> listaDeLivros) {
		super(listaDeLivros);
	}

	@Override
	public double fazerEmprestimo(Livro livro, Data dataInicio, Data dataFim) 
			throws LivroEmprestadoException {
		double taxa = 2;
		int ano = dataFim.getAno() - dataInicio.getAno() * 12;
		int mes = dataFim.getMes() - dataInicio.getMes() * 30;
		int dia = dataFim.getDia() - dataInicio.getDia();

		for(Livro l: getListaDeLivros()) {
			if(l.equals(livro)) {
				if(l.isEmprestado() == true) {
					throw new LivroEmprestadoException();
				} else {
					l.setEmprestado();
				}
			}

			}
		double valor = ano+mes+dia*taxa;
		return valor;
	}
	
}
