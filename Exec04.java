package atividade02;

import java.util.Scanner;
import java.io.IOException;

public class Exec04 {

	public static void main(String[] args) {
		
		Metodos metodos = new Metodos();
		Banco[] contas = new Banco[10];
		Scanner input = new Scanner(System.in);
		int escolhaConta = 0, escolha = 0;
		
		for(int i = 0; i < contas.length; i++) {
			contas[i] = new Banco(i+1);
		}
		metodos.geraSaldo(contas, 10000);
		
		do {
			System.out.printf("Bem vindo ao seu Banco!\nPor favor informe o número da conta: ");
			escolhaConta = input.nextInt();
			input.nextLine();
			if(escolhaConta > 10 || escolhaConta < 1){
				metodos.numeroErrado();
			}
	
			escolhaConta--;
			if(escolhaConta < 10 && escolhaConta > -1) {
				metodos.mostraSaldo(contas, escolhaConta);
		
				System.out.print("Informe a ação que deseja efetuar\n1 - Para efetuar transferência;\n2 - Para efetuar saque;\n3 - Para consultar o ativo bancário;\n4 - Para efetuar depósito"
						+ "\n0 (ou inferior) - Para encerrar o programa;\n");
				escolha = input.nextInt();
				input.nextLine();
				if(escolha > 0 && escolha < 5 && escolhaConta < 10 && escolhaConta >= 0) {
					metodos.acaoBanco(escolha, contas, escolhaConta);
				} else if(escolha > 4 && escolhaConta < 10 && escolhaConta >= 0) {
					metodos.numeroErrado();
				} else if(escolhaConta < 10 && escolhaConta >= 0 && escolha <= 0){
					metodos.programaEncerrado();
				}
			} else {
				escolha = 1;
			}
		}while (escolha > 0);
		
		input.close();
	}

}
