package olamundo9;

import java.util.Scanner;

public class Exec8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Metodos calc = new Metodos();
		double value, paid, change;
		
		System.out.print("Quanto vale o produto? ");
		value = input.nextDouble();
		System.out.print("Quanto foi pago? ");
		paid = input.nextDouble();
		
		change = paid - value;
		if(change > 0.0) {
			calc.calculateChange(change);
		}
		else {
			System.out.println("Impossível calcular o troco.");
		}
		
		input.close();
	}

}
