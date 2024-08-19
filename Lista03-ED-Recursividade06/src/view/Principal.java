package view;

import controller.SomatoriaController;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		SomatoriaController somatoria = new SomatoriaController();
		
		int n;
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		double resultado = somatoria.Somatoria(n);
		
		System.out.println("O resultado da somatória é: " + resultado);
	}
}
