package app;

public class Main {

	public static void main(String[] args) {
		
		MercadoLivre mercado = new MercadoLivre();
		
		Produto relogio = new Produto(100, "Relogio", "C�ssio", new Data ((short) 01, (short) 4, (short) 2020, (short) 9));
				System.out.println(relogio);
		Produto tenis = new Produto(1000, "TENIS", "C�ssio", new Data ((short) 02, (short) 5, (short) 2021, (short) 10));
				System.out.println(tenis);
		Produto calca = new Produto(150, "cal�a", "C�ssio", new Data ((short) 03, (short) 6, (short) 2022, (short) 11));
				System.out.println(calca);
		
		mercado.anunciarProduto(relogio);
		mercado.anunciarProduto(tenis);
		mercado.anunciarProduto(calca);
		mercado.getQuantidadeProdutos();
		System.out.println(mercado.getProdutosVendedor("C�ssio"));
		System.out.println(mercado.getProdutosComPalavra("cal�a"));
		System.out.println("VEJA O MAIS ANTIGO NO MOMENTO: \n"+mercado.getIndiceMaisAntigo("C�ssio"));
		mercado.removeMaisAntigo("C�ssio");
		System.out.println("VEJA O MAIS ANTIGO NO MOMENTO: \n"+mercado.getIndiceMaisAntigo("C�ssio"));
		mercado.removeMaisAntigo("C�ssio");
		System.out.println("VEJA O MAIS ANTIGO NO MOMENTO: \n"+mercado.getIndiceMaisAntigo("C�ssio"));
		
		
		}
}
