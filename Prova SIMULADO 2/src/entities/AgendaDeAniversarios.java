package entities;

import java.util.ArrayList;

public interface AgendaDeAniversarios {
	
	public void adicionarAniversariante(String nome, int dia, int mes);
	
	public ArrayList<String >obterAniversariantesDoMes(int mes) throws NaoExisteAniversariante;
	
	public void removerAniversariante(String nomeAniversariante) throws NaoExisteAniversariante;
}
