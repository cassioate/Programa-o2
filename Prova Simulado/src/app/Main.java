package app;

public class Main {

	public static void main(String[] args) {

			Autor c = new Autor("Eduardo", "Lucena", "Falcão");
			
			try {
			Artigo artigo = new Artigo (c,2020,"Programação Orientada a Objetos");
			EstrategiaCitacao es = new ModeloInternacional();
			EstrategiaCitacao es2 = new ModeloBrasileiro();
			System.out.println(es.getCitacao(artigo));
			System.out.println(es2.getCitacao(artigo));
			} catch(AnoInvalidoException e) {
				System.out.println(e.getMessage());
			} catch(IllegalArgumentException e){
				e.printStackTrace();
			} 	
	}

}
