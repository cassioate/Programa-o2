package entities;

public class NaoExisteAniversariante extends Exception{
	public NaoExisteAniversariante () {
		super("Não existe um aniversariante nessa data");
	}
}
