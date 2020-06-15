package entities;

public class Aniversariante {
	
	private String nome;
	private DataAniversario dataAniversario;
	
	public Aniversariante(String nome, DataAniversario dataAniversario) {
		super();
		this.nome = nome;
		this.dataAniversario = dataAniversario;
	}

	public boolean ehAniversarianteDoMes(int mes){
		boolean ehVerdadeiro = false;
		if (dataAniversario.getMes() == mes) {
			ehVerdadeiro = true;
		} else {
			ehVerdadeiro = false;
		}
		return ehVerdadeiro;
	}

	public DataAniversario getDataAniversario() {
		
		return dataAniversario;
	}

	public void setDataAniversario(DataAniversario dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString(){
		return nome+ " na data: " +dataAniversario;
	}
}
