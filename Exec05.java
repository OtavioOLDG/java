package atividade02;

import java.util.Random;

public class Exec05 {

	public static void main(String[] args) {
		
		Random random = new Random();
		Metodos metodo = new Metodos();
		int[][] matriz = new int[7][7];
		int[] vet1 = new int[7];
		int[] vet2 = new int[7];
		int colunas = 7, linhas = 7;
		
		metodo.randomizaMatriz(matriz, linhas, colunas, 100);
		metodo.printaMatriz(matriz, linhas, colunas);
		metodo.preencheVetorLinhas(matriz, vet1, linhas, colunas);
		System.out.print("O maiores valores das respectivas linhas são: ");
		metodo.printaVetor(vet1);
		metodo.preencheVetorColunas(matriz, vet2, linhas, colunas);
		System.out.print("O menores valores das respectivas colunas são: ");
		metodo.printaVetor(vet2);

	}

}
