package olamundo9;

import java.util.Scanner;

public class Exec9 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n1, i = 2;
		boolean reveladora = true;
		
		System.out.printf("Digite um número para saber se ele é primo: ");
		n1 = input.nextInt();
		
		while(i < n1 && reveladora) {
			if(n1 % i == 0 && n1 != 0) {
				reveladora = false;
			}
			i++;
		}
		if(reveladora) {
			System.out.printf("O número %d é um número primo.\n", n1);
		}
		input.close();
	}
}
