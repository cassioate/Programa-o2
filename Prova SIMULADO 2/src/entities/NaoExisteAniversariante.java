package entities;

public class NaoExisteAniversariante extends Exception{
	public NaoExisteAniversariante () {
		super("N�o existe um aniversariante nessa data");
	}
}
