package entities;

import java.util.ArrayList;
import java.util.List;

public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios {
	
	private List<Aniversariante> aniversariantes = new ArrayList<Aniversariante>();
	private Aniversariante aniversariante;

	public List<Aniversariante> getAniversariantes() {
		return aniversariantes;
	}

	public Aniversariante getAniversariante() {
		return aniversariante;
	}

	@Override
	public void adicionarAniversariante(String nome, int dia, int mes) {
		aniversariante = new Aniversariante(nome, new DataAniversario (dia, mes));
		aniversariantes.add(aniversariante);
	}

	@Override
	public ArrayList<String> obterAniversariantesDoMes(int mes) throws NaoExisteAniversariante {
		boolean excecao = true;
		ArrayList<String> doMes = new ArrayList<String>();
		for (Aniversariante a : aniversariantes) {
			if (a.ehAniversarianteDoMes(mes)){
					doMes.add(a.getNome());
					excecao = false;
			} 
		}
		
		if(excecao == true) {
			throw new NaoExisteAniversariante();
			}
		
		return doMes;
	}

	@Override
	public void removerAniversariante(String nomeAniversariante) throws NaoExisteAniversariante {
		ArrayList<Aniversariante> retorno = new ArrayList<Aniversariante>();
		boolean excecao = true;
		for (Aniversariante a : aniversariantes) {
			if (a.getNome() == nomeAniversariante) {
				retorno.add(a);
				excecao = false;
			} 
		}
		if(excecao == true) {
			throw new NaoExisteAniversariante();
			}
//		Tive que usar esse for para remover, porque não posso deletar em uma lista enquanto percorro ela, então tive que salvar em outra lista quem eu queria remover.
		for (Aniversariante a: retorno) {
			aniversariantes.remove(a);
		}
	}
}
