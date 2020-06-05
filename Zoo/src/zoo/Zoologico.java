package zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
	
	private List<Animal> jaulas;
	
	public Zoologico (){
		jaulas = new ArrayList<Animal>();
		
		Cachorro tutu = new Cachorro("Tutu", 2);
		Zebra rambo = new Zebra("Rambo", 5);
		Cavalo vendaval4 = new Cavalo("Vendaval 4", 8);
		Leao furioso = new Leao ("Furioso", 10);
		Preguica z = new Preguica ("z", 2);
		
		jaulas.add(tutu);
		jaulas.add(rambo);
		jaulas.add(vendaval4);
		jaulas.add(furioso);
		jaulas.add(z);
		
	}
	
	public void cutucar() {
		for (Animal a : jaulas) {
		System.out.println(a);
		a.emitirSom();
		if(a instanceof Cachorro) {
			((Cachorro) a).fazerAlgo();
			}
		if(a instanceof Leao) {
			((Leao) a).fazerAlgo();
			}
		if(a instanceof Zebra) {
			((Zebra) a).fazerAlgo();
			}
		if(a instanceof Cavalo) {
			((Cavalo) a).fazerAlgo();
			}
		if(a instanceof Preguica) {
			((Preguica) a).fazerAlgo();;
			}
		}
	}
	
	/*
	 * Essa seria outra forma de fazer por polimorfismo
	 */
	
//	public void cutucar() {
//		for (Animal a : jaulas) {
//		System.out.println(a);
//		a.emitirSom();
//		a.fazerAlgo();
//		}
//	}
	
	public static void main(String[] args) {
		Zoologico z = new Zoologico();
		z.cutucar();
	}


}
