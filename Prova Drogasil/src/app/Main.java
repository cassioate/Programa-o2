package app;

public class Main {

	public static void main(String[] args) {
		
		Drogasil drogasil = new Drogasil();
		
		Remedio remedio1 = new Remedio(10, "Carlito", "Sei La", new Data(12, 12, 2020));
		Remedio remedio2 = new Remedio(10, "Carlito", "Sei La", new Data(12, 12, 2018));
		Remedio remedio3 = new Remedio(10, "Carlito", "Sei La", new Data(12, 12, 2010));
		
		drogasil.adicionarRemedio(remedio1);
		drogasil.adicionarRemedio(remedio2);
		drogasil.adicionarRemedio(remedio3);
		drogasil.adicionarRemedio(remedio3);

		drogasil.removeRemediosVencidos();
		System.out.println(drogasil.getQuantidadeRemedios());

	}

}
