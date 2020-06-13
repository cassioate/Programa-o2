package app;

import java.util.ArrayList;
import java.util.List;

public class SistemaRestaurante {
	
	private List<Cliente> clientes;
	
	public List<Cliente> getClientes() {
		return clientes;
	}

	public SistemaRestaurante() {
		clientes = new ArrayList<Cliente>();
	}

	public void adicionarCliente(Cliente c) {
		clientes.add(c);
	}
	
	public void adicionarPedido(int mesa, Item item) throws ClienteInexistenteException {
		int contador = 0;
		for(Cliente c: clientes) {
			if(c.getMesa() == mesa) {
				c.adicionarPedido(item);
				contador = 1;
			}
		} if(contador == 0) {
				throw new ClienteInexistenteException();
			}
		}
		

	public void removerPedido(int mesa, Item i) throws PedidoInexistenteException {
		int contador = 0;
		for (Cliente c : clientes) {
			if(c.getMesa() == mesa) {
				c.removerPedido(i);
				contador = 1;
			} 
		} if(contador == 0) {
				throw new PedidoInexistenteException();
			}
		}
	
	public double computarPagamentoCliente(int mesa) {
		
		double conta = 0;
		for (Cliente c : clientes) {
			if(c.getMesa() == mesa) {
				conta+= c.getConta();
			}
		}
		return conta;
	}
	
	public void receberPagamentoCliente(int mesa, double pagamento) throws PagamentoInvalidoException {
		
		if (!(computarPagamentoCliente(mesa) <= pagamento)) {
			throw new PagamentoInvalidoException();
		} else {
			System.out.println("A conta foi paga!");
		}
	}
}

