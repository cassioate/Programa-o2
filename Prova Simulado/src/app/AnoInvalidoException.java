package app;

public class AnoInvalidoException extends Exception {
	public AnoInvalidoException() {
	super("Ano do artigo maior que o permitido!");
	}
}
