package app;

public class Refeicao implements Item{
		
		private Proteina proteina;
		private Carboidrato carboidrato;
		
		public Refeicao(Proteina proteina, Carboidrato carboidrato) {
			this.proteina = proteina;
			this.carboidrato = carboidrato;
		}
		
		public Proteina getProteina() {
			return proteina;
		}
		public Carboidrato getCarboidrato() {
			return carboidrato;
		}
		
		@Override
		public double getPreco() {
			return proteina.getValor()+carboidrato.getValor();
		}
		@Override
		public String getDescricao() {
			return "Refeião: " + proteina + " com " + carboidrato ;
		}
		
}

