package olamundo9;

public class Metodos {
	
	public void calculatePayment(double hoursWorked, double paymentPerHour) {
		
		double grossSalary, taxes = 30, netSalary;
		
		grossSalary = hoursWorked * paymentPerHour;
		netSalary = grossSalary * ((100 - taxes) / 100);
		
		System.out.println("Salário bruto: R$" + grossSalary);
		System.out.println("Salário líquido: R$" + netSalary);
		
	}
	
	public void calculateKillowatts(double kw, double minSalaray) {
		double kwCost, kwHome;
		
		kwCost = minSalaray * 0.01;
		kwHome = kwCost * kw;
		
		System.out.println("Valor do quilowatt: R$" + kwCost + ";");
		System.out.println("Valor consumido na residência: R$" + kwHome + "0.");
		
	}
	
	public void triangle(int ang1, int ang2, int ang3) {
		
		if(ang1 == 60 && ang2 == 60 && ang3 == 60) {
			System.out.println("O triângulo informado é um triângulo retângulo.");
		}
		else if(((ang1 + ang2 + ang3) == 180) && ((ang1 == ang2 && ang2 != ang3) || (ang2 == ang3 && ang2 != ang1) || (ang1 == ang3 && ang3 != ang2))) {
			if(ang1 == 90 || ang2 == 90 || ang3 == 90){
				System.out.println("O triângulo informado é isósceles retângulo.");
			}
			else {
				System.out.println("O triângulo informado é isósceles.");
			}
		}
		else if(((ang1 + ang2 + ang3) == 180) && ang1 != ang2 && ang2 != ang3 && ang1 != ang3) {
			if(ang1 == 90 || ang2 == 90 || ang3 == 90) {
				System.out.println("O triângulo informado é escaleno retângulo.");
			}
			else if(ang1 < 90 && ang2 < 90 && ang3 < 90) {
				System.out.println("O triângulo informado é acutângulo escaleno.");
			}
			else if(ang1 > 90 || ang2 > 90 || ang3 > 90){
				System.out.println("O triângulo informado é obtusângulo escaleno.");
			}
		}
		else {
			System.out.println("Não é triângulo.");
		}
	}
	
	public void marketPrice(int pCode) {
		if(pCode > 0 && pCode < 11) {
			System.out.println("O produto comprado vale R$ 10,00 a unidade");
		}
		else if(pCode > 10 && pCode < 21) {
			System.out.println("O produto comprado vale R$ 15,00 a unidade");
		}
		else if(pCode > 20 && pCode < 31) {
			System.out.println("O produto comprado vale R$ 20,00 a unidade");
		}
		else if(pCode > 30 && pCode < 41) {
			System.out.println("O produto comprado vale R$ 40,00 a unidade");
		}
		else {
			System.out.println("Código inválido");
		}
	}
	
	public int marketTotal(int pCode, int qBought) {
		int price = 0;
		if(pCode > 0 && pCode < 11) {
			System.out.printf("O total comprado equivale à R$%d,00\n", (10 * qBought));
			price = 10;
		}
		else if(pCode > 10 && pCode < 21) {
			System.out.printf("O total comprado equivale à R$%d,00\n", (15 * qBought));
			price = 15;
		}
		else if(pCode > 20 && pCode < 31) {
			System.out.printf("O total comprado equivale à R$%d,00\n", (20 * qBought));
			price = 20;
		}
		else if(pCode > 30 && pCode < 41) {
			System.out.printf("O total comprado equivale à R$%d,00\n", (40 * qBought));
			price = 40;
		}
		return price * qBought;
	}
	
	public void marketDiscount(int total) {
		if(total < 250) {
			System.out.printf("O total com a aplicação do desconto equivale à R$%.2f.\n", (double) total * 0.95);
		}
		else if(total > 250 && total <= 500) {
			System.out.printf("O total com a aplicação do desconto equivale à R$%.2f.\n", (double) total * 0.90);
		}
		else if(total > 500) {
			System.out.printf("O total com a aplicação do desconto equivale à R$%.2f.\n", (double) total * 0.85);
		}
	}
	
	void fatorialCalcule(int number) {
		int fatorial = 1;
		for(int i = 1; i <= number; i++) {
			fatorial *= i; 
		}
		System.out.println(fatorial);
	}
	
	void fatorialDistanceCalc(int number1, int number2) {
		for(int o = number1; o <= number2; o++) {
			int fatorial = 1;
			for(int i = 1; i <= o; i++) {
				fatorial *= i; 
			}
			System.out.printf("Fatorial de %d: %d;\n", o, fatorial);
		}
	}
	
	void calculateChange(double paid) {
		int count200 = 0, count100 = 0, count50 = 0, count20 = 0, count10 = 0;
		int count5 = 0, count2 = 0, count1 = 0, count05 = 0, count025 = 0;
		int count010 = 0, count005 = 0, count001 = 0;
		while(paid > 0.0) {
			if((paid - 200) >= 0.0) {
				count200++;
				paid -= 200;
			}
			else if((paid - 200) < 0.0 && (paid - 100) >= 0.0 ) {
				count100++;
				paid -= 100;
			}
			else if((paid - 200) < 0.0 && (paid - 100) < 0.0 && (paid - 50) >= 0.0) {
				count50++;
				paid -= 50;
			}
			else if((paid - 200) < 0.0 && (paid - 100) < 0.0 && (paid - 50) < 0.0 && (paid - 20) >= 0.0) {
				count20++;
				paid -= 20;
			}
			else if((paid - 200) < 0.0 && (paid - 100) < 0.0 && (paid - 50) < 0.0 && (paid - 20) < 0.0 && (paid - 10) >= 0.0) {
				count10++;
				paid -= 10;
			}
			else if((paid - 200) < 0.0 && (paid - 100) < 0.0 && (paid - 50) < 0.0 && (paid - 20) < 0.0 && (paid - 10) < 0.0 && (paid - 5) >= 0.0) {
				count5++;
				paid -= 5;
			}
			else if((paid - 200) < 0.0 && (paid - 100) < 0.0 && (paid - 50) < 0.0 && (paid - 20) < 0.0 && (paid - 10) < 0.0 && (paid - 5) < 0.0 && (paid - 2) >= 0.0) {
				count2++;
				paid -= 2;
			}
			else if((paid - 200) < 0.0 && (paid - 100) < 0.0 && (paid - 50) < 0.0 && (paid - 20) < 0.0 && (paid - 10) < 0.0 && (paid - 5) < 0.0 && (paid - 2) < 0.0 && (paid - 1) >= 0.0) {
				count1++;
				paid -= 1;
			}
			else if((paid - 200) < 0.0 && (paid - 100) < 0.0 && (paid - 50) < 0.0 && (paid - 20) < 0.0 && (paid - 10) < 0.0 && (paid - 5) < 0.0 && (paid - 2) < 0.0 && (paid - 1) < 0.0 && (paid - 0.5) >= 0.0) {
				count05++;
				paid -= 0.5;
			}
			else if((paid - 200) < 0.0 && (paid - 100) < 0.0 && (paid - 50) < 0.0 && (paid - 20) < 0.0 && (paid - 10) < 0.0 && (paid - 5) < 0.0 && (paid - 2) < 0.0 && (paid - 1) < 0.0 && (paid - 0.5) < 0.0 && (paid - 0.25) >= 0.0) {
				count025++;
				paid -= 0.25;
			}
			else if((paid - 200) < 0.0 && (paid - 100) < 0.0 && (paid - 50) < 0.0 && (paid - 20) < 0.0 && (paid - 10) < 0.0 && (paid - 5) < 0.0 && (paid - 2) < 0.0 && (paid - 1) < 0.0 && (paid - 0.5) < 0.0 && (paid - 0.25) < 0.0 && (paid - 0.10) >= 0.0) {
				count010++;
				paid -= 0.10;
			}
			else if((paid - 200) < 0.0 && (paid - 100) < 0.0 && (paid - 50) < 0.0 && (paid - 20) < 0.0 && (paid - 10) < 0.0 && (paid - 5) < 0.0 && (paid - 2) < 0.0 && (paid - 1) < 0.0 && (paid - 0.5) < 0.0 && (paid - 0.25) < 0.0 && (paid - 0.10) < 0.0 && (paid - 0.05) >= 0.0) {
				count005++;
				paid -= 0.05;
			}
			else if((paid - 200) < 0.0 && (paid - 100) < 0.0 && (paid - 50) < 0.0 && (paid - 20) < 0.0 && (paid - 10) < 0.0 && (paid - 5) < 0.0 && (paid - 2) < 0.0 && (paid - 1) < 0.0 && (paid - 0.5) < 0.0 && (paid - 0.25) < 0.0 && (paid - 0.10) < 0.0 && (paid - 0.05) < 0.0 && (paid - 0.01) >= 0.0) {
				count001++;
				paid -= 0.01;
			}
		}
		
		System.out.printf("Total a ser devolvido:\n%d nota(s) de R$ 200,00\n%d nota(s) de R$ 100,00\n%d nota(s) de R$ 50,00\n%d nota(s) de R$ 20,00\n%d nota(s) de R$ 10,00\n%d nota(s) de"
				+ " R$ 5,00\n%d nota(s) de R$ 2,00\n%d Moeda(s) de R$ 1,00\n%d Moeda(s) de R$ 0,50\n%d Moeda(s) de R$ 0,25\n"
				+ "%d Moeda(s) de R$ 0,10\n%d Moeda(s) de R$ 0,05\n%d Moeda(s) de R$ 0,01\n", count200, count100, count50, count20, count10, count5, count2, count1, count05, count025, count010, count005, count001);
		
	}
	
}
