package app;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
	
	List <Refeicao> refeicao;
	List <Bebida> bebida;
	List <Item> cardapio;
	
	public Cardapio(){
		
		this.refeicao = new ArrayList<Refeicao>();
		this.bebida = new ArrayList<Bebida>();
		
		this.bebida.add(new Bebida(Tamanho.GRANDE, Sabor.CERVEJA));
		this.bebida.add(new Bebida(Tamanho.PEQUENO, Sabor.CERVEJA));
		this.bebida.add(new Bebida(Tamanho.GRANDE, Sabor.COCA));
		this.bebida.add(new Bebida(Tamanho.MEDIO, Sabor.COCA));
		this.bebida.add(new Bebida(Tamanho.PEQUENO, Sabor.COCA));
		this.bebida.add(new Bebida(Tamanho.GRANDE, Sabor.GUARANA));
		this.bebida.add(new Bebida(Tamanho.MEDIO, Sabor.GUARANA));
		this.bebida.add(new Bebida(Tamanho.PEQUENO, Sabor.GUARANA));
		this.bebida.add(new Bebida(Tamanho.GRANDE, Sabor.JARRADELARANJA));
		this.bebida.add(new Bebida(Tamanho.GRANDE, Sabor.SODA));
		this.bebida.add(new Bebida(Tamanho.GRANDE, Sabor.SUCODELIMAO));
		this.bebida.add(new Bebida(Tamanho.GRANDE, Sabor.SUCODEUVA));
		this.refeicao.add(new Refeicao(Proteina.FRANGO,Carboidrato.ARROZ));
		this.refeicao.add(new Refeicao(Proteina.FRANGO,Carboidrato.MACARRAO));
		this.refeicao.add(new Refeicao(Proteina.LINGUICA,Carboidrato.FEIJAO));
		this.refeicao.add(new Refeicao(Proteina.PICANHA,Carboidrato.PURE));
		this.refeicao.add(new Refeicao(Proteina.PEIXE,Carboidrato.ARROZ));
		this.refeicao.add(new Refeicao(Proteina.OVO,Carboidrato.BATATA));
		this.refeicao.add(new Refeicao(Proteina.PICANHA,Carboidrato.ARROZ));
		
		this.cardapio = new ArrayList<Item>();
		this.cardapio.addAll(bebida);
		this.cardapio.addAll(refeicao);
	}
	
	public List<Refeicao> getRefeicoes() {;
		return refeicao;
	}
	
	public List<Bebida> getBebidas() {
		return bebida;
	}
	
	public List<Item> getCardapio() {
		return cardapio;
	}
}

//função getRefeicoes(): List
//crie a função getBebidas(): List
//crie a função getCardapio(): List
 