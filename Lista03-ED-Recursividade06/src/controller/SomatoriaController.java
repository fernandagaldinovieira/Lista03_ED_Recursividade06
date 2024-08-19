package controller;

public class SomatoriaController {

	public SomatoriaController() {
		super();
	}

	public double Somatoria(int n) {
		
		//Condição de parada: Se n for 1, a função retorna 1, que é o primeiro termo da série.
		if (n == 1) {
			return 1;
		} else {
			//Soma o primeiro termo (1 / n!) ao resultado da série para n - 1
			return 1 / Fatorial(n) + Somatoria(n - 1);
		}
	}
	
	//Função auxiliar para o cálculo do fatorial de n
	public double Fatorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * Fatorial(n - 1);
		}	
	}
}
