package olamundo9;

import java.util.Scanner;

public class Exec2 {

	public static void main(String[] args) {
		
		Metodos metodo = new Metodos();
		double kw, minSalary;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Quanto é o valor do salário mínimo? ");
		minSalary = input.nextDouble();
		System.out.print("Quantos quilowatts foram consumidos em sua residência? ");
		kw = input.nextDouble();
		
		metodo.calculateKillowatts(kw, minSalary);
		
		input.close();
	}

}
