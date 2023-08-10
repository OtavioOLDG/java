package olamundo9;

import java.util.Scanner;

public class Exec6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Metodos fatorial = new Metodos();
		int number;
		
		number = input.nextInt();
		fatorial.fatorialCalcule(number);
		
		input.close();
	}
}
