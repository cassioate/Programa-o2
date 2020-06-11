package app;

public class ModeloInternacional implements EstrategiaCitacao {

	@Override
	public String getCitacao(Artigo artigo) {
		String citacao = artigo.getAutor().getUltimoNome().toUpperCase()+", "+artigo.getAutor().getPrimeiroNome().toUpperCase().substring(0, 1)+
				"."+artigo.getAutor().getNomeDoMeio().toUpperCase().substring(0, 1)+"., "+ artigo.getTitulo()+", "+ artigo.getAno();
		return citacao;
	}

}

