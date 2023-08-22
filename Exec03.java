package atividade02;

public class Exec03 {

	public static void main(String[] args) {
		
		Metodos metodo = new Metodos();
		int[] vet1 = new int[10];
		int[] vet2 = new int[5];
		int max = 100, tamanhoPar = 0, tamanhoDivImpar = 0;
		
		metodo.randomizaVetor(vet1, max);
		System.out.print("Vetor 1: ");
		metodo.printaVetor(vet1);
		
		metodo.randomizaVetor(vet2, max);
		System.out.print("Vetor 2: ");
		metodo.printaVetor(vet2);
		
		for(int i = 0; i < vet1.length; i++) {
			if((vet1[i] % 2) == 0) {
				tamanhoPar++;
			}
		}
		
		int[] vetResultante1 = new int[tamanhoPar];
		
		metodo.preencheVetorResultante1(vet1, vet2, vetResultante1);
		System.out.print("Vetor Resultante 1: ");
		metodo.printaVetor(vetResultante1);
		
		for(int i = 0; i < vet1.length; i++) {
			if((vet1[i] % 2) != 0) {
				tamanhoDivImpar++;
			}
		}
		
		int[] vetResultante2 = new int[tamanhoDivImpar];
		
		metodo.preencheVetorResultante2(vet1, vet2, vetResultante2);
		System.out.print("Vetor Resultante 2: ");
		metodo.printaVetor(vetResultante2);
	}

}
