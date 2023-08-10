package olamundo9;

import java.util.Scanner;

public class Exec3 {

	public static void main(String[] args) {

		Metodos metodo = new Metodos();
		Scanner input = new Scanner(System.in);
		int ang1, ang2, ang3;
		
		System.out.println("Informe o valor dos ângulos do triângulo que deseja analisar");
		System.out.print("Ângulo 1: ");
		ang1 = input.nextInt();
		System.out.print("Ângulo 2: ");
		ang2 = input.nextInt();
		System.out.print("Ângulo 3: ");
		ang3 = input.nextInt();
			
		metodo.triangle(ang1, ang2, ang3);
		
		input.close();
	}

}
