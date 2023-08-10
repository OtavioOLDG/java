package olamundo9;

import java.util.Scanner;

public class Exec7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Metodos fat = new Metodos();
		int number1, number2, aux;
		
		System.out.println("Insira dois números inteiros e positivos");
		do {
			System.out.print("Forneça o primeiro número: ");
			number1 = input.nextInt();
			System.out.print("Forneça o segundo número: ");
			number2 = input.nextInt();
		} while (number1 <= 0 || number2 <= 0);
		
		if(number2 < number1) {
			aux = number1;
			number1 = number2;
			number2 = aux;
		}
		
		fat.fatorialDistanceCalc(number1, number2);
		
		input.close();
	}
}
