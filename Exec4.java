package olamundo9;

import java.util.Scanner;

public class Exec4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Metodos metodo = new Metodos();
		int qBought, pCode, total;
		
		System.out.print("Qual o código do produto comprado?");
		pCode = input.nextInt();
		System.out.print("Qual a quantidade do produto que foi comprado?");
		qBought = input.nextInt();
		
		
		metodo.marketPrice(pCode);
		total = metodo.marketTotal(pCode, qBought);
		metodo.marketDiscount(total);
		
		input.close();
	}

}
