package app;

public class ModeloBrasileiro implements EstrategiaCitacao {

	@Override
	public String getCitacao(Artigo artigo) {
		
		String citacao = artigo.getAutor().getPrimeiroNome().toUpperCase()+" "+artigo.getAutor().getNomeDoMeio().toUpperCase().subSequence(0, 1)+". "+
				artigo.getAutor().getUltimoNome().toUpperCase()+", "+artigo.getAno()+", "+artigo.getTitulo()+".";
		
		return citacao;
	}
	

}

//Modelo brasileiro: EDUARDO L. FALCÃO, 2010, Programação Orientada a Objetos.
