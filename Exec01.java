package atividade02;

import java.util.Scanner;

public class Exec01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] numeros = new int[1000];
		int num = 1, i = 0, cont = 0;
		
		
		while(num > 0) {
			if ((cont % 20) == 0){
				System.out.println("Forneça um número inteiro positivo");
			}
			num = input.nextInt();
			if(num > 0) {
				numeros[i] = num;
				i++;
				cont++;
			}
		}
		i = 0;
		cont = 0;
		while(i < numeros.length && numeros[i] > 0) {
			double cubo = Math.pow(numeros[i], 3);
			double raiz = Math.sqrt(numeros[i]);
			if ((cont % 20) == 0){
				System.out.printf("\n-------------------------------------\n%-16s%-16s%-10s\n-------------------------------------\n" , "Número", "Ao cubo", "Raíz");
			}
			
			if(numeros[i+1] > 0) {
				System.out.printf("\n%-10d\t%-10.2f\t%-15.2f\n", numeros[i], cubo, raiz);
			} else {
				System.out.printf("\n%-10d\t%-10.2f\t%-15.2f\n", numeros[i], cubo, raiz);
			}
			i++;
			cont++;
		}
		
		input.close();

	}

}
