package app;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Drogasil {
	
	private Remedio [] estoque;
	private int posicao;
	
	public Remedio[] getEstoque() {
		return estoque;
	}

	public int getPosicao() {
		return posicao;
	}

	public Drogasil () {
		this.estoque = new Remedio[10];
		this.posicao = 0;
	}
	
	public void adicionarRemedio(Remedio r) {
		if (posicao >= estoque.length) {
			duplicaArray();
		}
		this.estoque[posicao] = r;
		posicao++;
		}
	
	public void adicionarRemedio (double preco, String nome, String bula, Data dataVencimento) {
		adicionarRemedio(new Remedio(preco,nome,bula,dataVencimento));
	}
	
	public void duplicaArray() {
		Remedio[] remedioAux = new Remedio[2*posicao];
		for (int i = 0; i < estoque.length; i++) {
			remedioAux[i] = this.estoque[i];
		}
		this.estoque = remedioAux;
	}
	
	public int getQuantidadeRemedios() {
		return posicao;
	}
	
	public List<Remedio> getRemediosVencidos(){
		
		LocalDateTime now = LocalDateTime.now();
		int year = now.getYear();
		int month = now.getMonthValue();
		int day = now.getDayOfMonth();
		
		List <Remedio> remediosVencidos = new ArrayList<Remedio>();

		for (int i = 0; i < estoque.length; i++) {
			if (estoque[i] != null) {
				
				if (estoque[i].getDataVencimento().getAno() < year) {
					remediosVencidos.add(estoque[i]);
				}
				
				else if (estoque[i].getDataVencimento().getAno() == year) {
					if (estoque[i].getDataVencimento().getMes() < month) {
						remediosVencidos.add(estoque[i]);
					}
				}
				
				else if (estoque[i].getDataVencimento().getMes() == month) {
					if (estoque[i].getDataVencimento().getDia() < day) {
						remediosVencidos.add(estoque[i]);
					}
				}
			
				}
			}
		
		return remediosVencidos;
		
		}
		
		public List<Remedio> getRemediosComPalavra(String remedio){
			List<Remedio> remedioPalavra = new ArrayList<Remedio>();
			for (int i = 0; i<estoque.length; i++) {
				if (estoque[i] != null) {
					if(estoque[i].getNome().contains(remedio)) {
						remedioPalavra.add(estoque[i]);
				}
			}
		}
			return remedioPalavra;
		}
		
		public void removeRemediosVencidos() {
			List<Remedio> remediosVencidos = new ArrayList<Remedio>();
			remediosVencidos = getRemediosVencidos();
			
			for (int i = 0 ; i < posicao; i++) {
				for (int j = 0 ; j < remediosVencidos.size(); j++) {
					if (estoque[i] == remediosVencidos.get(j)) {
						estoque[i] = null;
					}
				}
			}
			
			Remedio [] estoqueAux = new Remedio [posicao];
			int contador = 0;
			for (int i = 0 ; i < posicao; i++) {
				if (estoque[i] != null) {
					estoqueAux[contador] = estoque [i];
					contador++;
				}

			}
			
			this.estoque = estoqueAux;
			posicao = contador;
		}

}
			
			