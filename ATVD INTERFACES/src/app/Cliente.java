package app;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private int mesa;
	private List<Item> pedidos;
	
	public Cliente(int mesa) {
	this.mesa = mesa;
	pedidos = new ArrayList<Item>();
	}

	public int getMesa() {
		return mesa;
	}
	
	public List<Item> getPedidos() {
		return pedidos;
	}
	
	public void adicionarPedido(Item pedido) {
		pedidos.add(pedido);
	}
	
	public void removerPedido(Item pedido) {
		pedidos.remove(pedido);
	}

	public double getConta() {
		double total = 0;
		for(Item i: pedidos) {
			total += i.getPreco();
		}
		return total;
	}

}
