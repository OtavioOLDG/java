package olamundo9;

import java.util.Scanner;

public class Exec1 {

	public static void main(String[] args) {
		
		Metodos metodo = new Metodos();
		double hourWorked, paymentPerHour;
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Quantas horas você trabalhou? ");
		hourWorked = input.nextDouble();
		System.out.print("Qual o valor da sua hora trabalhada? ");
		paymentPerHour = input.nextDouble();
		
		metodo.calculatePayment(hourWorked, paymentPerHour);
		
		input.close();
	}

}
