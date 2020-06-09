package app;

public class Main {

	public static void main(String[] args) {
		
		MercadoLivre mercado = new MercadoLivre();
		
		Produto relogio = new Produto(100, "Relogio", "Cássio", new Data ((short) 01, (short) 4, (short) 2020, (short) 9));
				System.out.println(relogio);
		Produto tenis = new Produto(1000, "TENIS", "Cássio", new Data ((short) 02, (short) 5, (short) 2021, (short) 10));
				System.out.println(tenis);
		Produto calca = new Produto(150, "calça", "Cássio", new Data ((short) 03, (short) 6, (short) 2022, (short) 11));
				System.out.println(calca);
		
		mercado.anunciarProduto(relogio);
		mercado.anunciarProduto(tenis);
		mercado.anunciarProduto(calca);
		mercado.getQuantidadeProdutos();
		System.out.println(mercado.getProdutosVendedor("Cássio"));
		System.out.println(mercado.getProdutosComPalavra("calça"));
		System.out.println("VEJA O MAIS ANTIGO NO MOMENTO: \n"+mercado.getIndiceMaisAntigo("Cássio"));
		mercado.removeMaisAntigo("Cássio");
		System.out.println("VEJA O MAIS ANTIGO NO MOMENTO: \n"+mercado.getIndiceMaisAntigo("Cássio"));
		mercado.removeMaisAntigo("Cássio");
		System.out.println("VEJA O MAIS ANTIGO NO MOMENTO: \n"+mercado.getIndiceMaisAntigo("Cássio"));
		
		
		}
}
