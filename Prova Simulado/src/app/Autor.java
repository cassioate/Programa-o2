package app;

public class Autor {
	
	private String primeiroNome;
	private String nomeDoMeio;
	private String ultimoNome;
	
	public Autor(String primeiroNome, String nomeDoMeio, String ultimoNome) {
		this.primeiroNome = primeiroNome;
		this.nomeDoMeio = nomeDoMeio;
		this.ultimoNome = ultimoNome;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public String getNomeDoMeio() {
		return nomeDoMeio;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}
	

}
