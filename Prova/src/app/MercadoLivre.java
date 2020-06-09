package app;

import java.util.ArrayList;
import java.util.List;

public class MercadoLivre {
		
	private Produto [] produtos;
	private int posicao;
	
	public MercadoLivre () {
		this.produtos = new Produto[10];
		this.posicao = 0;
	}
	
	public MercadoLivre (int tamanho) {
		this.produtos = new Produto[tamanho];		
	}
	
	public void anunciarProduto(Produto p) {
		if (posicao >= produtos.length) {
			duplicaArray();
		}
		this.produtos[posicao] = p;
		posicao++;
		}
	
//	evitar DUPLICIDADE DO CODIGO:
	public void anunciarProduto (double preco, String nome, String vendedor, Data dataAnuncio) {
		anunciarProduto(new Produto(preco, nome, vendedor, dataAnuncio));
	}
	
	public void duplicaArray() {
		Produto[] produtosAux = new Produto[2*posicao];
		for (int i = 0; i < produtos.length; i++) {
			produtosAux[i] = this.produtos[i];
		}
		this.produtos = produtosAux;
	}
	
	public int getQuantidadeProdutos() {
		return posicao;
	}
	
// Essas duas questões abaixo, fiz com for indexado e for-each, para que eu possa entender melhor as diferenças de trabalhar com um e outro.	
	
//	----------------------------------------------------------------------------------------------------------------------------------------
	
	public List<Produto> getProdutosVendedor(String vendendo){
		List<Produto> produtosVendedor = new ArrayList<Produto>();
		for (int i = 0; i<produtos.length; i++) {
			if (produtos[i] != null) {
				if(produtos[i].getVendedor().contentEquals(vendendo)) {
					produtosVendedor.add(produtos[i]);
			}
		}
	}
		return produtosVendedor;
}
//										DUVIDA: Essa seria a foram correta de se fazer por for-each?

//	public List<Produto> getProdutosVendedor(String vendendo){
//		List<Produto> produtosVendedor = new ArrayList<Produto>();
//		for (Produto p : produtos) {
//			if(vendendo == p.getVendedor()) {
//				produtosVendedor.add(p);
//			}
//		}
//		return produtosVendedor;
//	}

//	----------------------------------------------------------------------------------------------------------------------------------------
	
	public List<Produto> getProdutosComPalavra (String palavra){
		List<Produto> contem = new ArrayList<Produto>();
			for (int i = 0; i<produtos.length; i++) {
				if (produtos[i] != null) {
				if(palavra == produtos[i].getNome()) {
					contem.add(produtos[i]);
				}
			}
		}
		return contem;
	}

	public void removeMaisAntigo(String vendedor) {
		Produto produtoMaisAntigo = getIndiceMaisAntigo(vendedor);
		
	for (int i=1; i<produtos.length; i++)	
		if(produtos[i-1] == produtoMaisAntigo) {
			if (produtos[i-1] == produtoMaisAntigo) {
				Produto produtosAux = produtos [i-1];
				produtos[i-1] = produtos [i];
				produtos[i] = produtosAux;
			}
		}
	for (int i=0; i<produtos.length; i++)	
		if(produtos[i] == produtoMaisAntigo) {
			produtos[i] = null;
		}
	}
	
	public Produto getIndiceMaisAntigo (String vendedor) {
		List<Produto> listaVendedor = getProdutosVendedor(vendedor);
		Produto maisAntiga = produtos[0];
		
		for (int i=1; i<produtos.length; i++) {
			if (produtos[0] != null && produtos[i] != null) {
				
			// Anos Diferentes:
				if(maisAntiga.getDataAnuncio().getAno() < listaVendedor.get(i).getDataAnuncio().getAno()) { 
					break;
				} else if (maisAntiga.getDataAnuncio().getAno() > listaVendedor.get(i).getDataAnuncio().getAno()) { 
					maisAntiga = listaVendedor.get(i);	
				} 
				
			// Anos Iguais, então comapara meses agora:
				else { 
				if(maisAntiga.getDataAnuncio().getMes() < listaVendedor.get(i).getDataAnuncio().getMes()) {	
					break;
				} else if (maisAntiga.getDataAnuncio().getMes() > listaVendedor.get(i).getDataAnuncio().getMes()) { 
					maisAntiga = listaVendedor.get(i);
				}
					
			// Meses iguais, então comapra os dias agora:
				else { 
				if (maisAntiga.getDataAnuncio().getDia() < listaVendedor.get(i).getDataAnuncio().getDia()) {
					break;
				} else if (maisAntiga.getDataAnuncio().getDia() > listaVendedor.get(i).getDataAnuncio().getDia()) {
					maisAntiga = listaVendedor.get(i);
							}
			// Diais iguais, então comapra as horas agora:		
				else { 
				if(maisAntiga.getDataAnuncio().getHora() < listaVendedor.get(i).getDataAnuncio().getHora()) {
					break;
				} else if(maisAntiga.getDataAnuncio().getHora() > listaVendedor.get(i).getDataAnuncio().getHora()) {
					maisAntiga = listaVendedor.get(i);
				
							}
						}
					}								
				}
			}
		}
		return maisAntiga;
	}
}































//public List<Produto> getIndiceMaisAntigo (String vendedor) {
//
//List<Produto> listaVendedor = getProdutosVendedor(vendedor);
//List<Produto> listaFinal = new ArrayList<Produto>();
//
//for (int i=0; i<produtos.length; i++) {
//	if(listaVendedor.get(i+1).getDataAnuncio().getAno() >= listaVendedor.get(i).getDataAnuncio().getAno() && 
//	listaVendedor.get(i+1).getDataAnuncio().getMes() >= listaVendedor.get(i).getDataAnuncio().getMes() &&
//	listaVendedor.get(i+1).getDataAnuncio().getDia() >= listaVendedor.get(i).getDataAnuncio().getDia() &&
//	listaVendedor.get(i+1).getDataAnuncio().getHora() >= listaVendedor.get(i).getDataAnuncio().getHora()) {
//		listaFinal.add(listaVendedor.get(i+1));										
//	}
//}
//return listaFinal;	
//}

//public void removeMaisAntigo(String vendedor) {
//List<Produto> removiveis = getIndiceMaisAntigo(vendedor);
//for (Produto p : produtos) {
//	if (removiveis == vendedor) {
//	
//	}