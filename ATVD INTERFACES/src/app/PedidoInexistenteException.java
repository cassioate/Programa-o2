package app;

public class PedidoInexistenteException extends Exception {
	public PedidoInexistenteException() {
		super("Pedido inexistente!");
	}
}
