package atividade02;

import java.util.Random;
import java.util.Scanner;

public class Metodos {
	//Exercício 03
	Random random = new Random();
	public void  randomizaVetor(int[] vetor, int max) {
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = random.nextInt(max);
		}
	}
	
	public void  randomizaMatriz(int[][] matriz, int linhas, int colunas, int max) {
		for(int i = 0; i < linhas; i++) {
			for(int o = 0; o < colunas; o++) {
				matriz[i][o] = random.nextInt(max);
			}
		}
	}
	
	public void printaVetor(int[] vetor) {
		for(int i = 0; i < vetor.length; i++) {
			if((i+1) < vetor.length) {
				System.out.printf("%d, ", vetor[i]);
			} else {
				System.out.printf("%d.\n", vetor[i]);
			}
		}
	}
	
	public void  printaMatriz(int[][] matriz, int linhas, int colunas) {
		for(int i = 0; i < linhas; i++) {
			for(int o = 0; o < colunas; o++) {
				System.out.printf("%d\t", matriz[i][o]);
			}
			System.out.println();
		}
	}
	
	public void preencheVetorResultante1(int[] vet1, int[] vet2, int[] vetorResultante1) {
		int cont = 0;
		for(int i = 0; i < vet1.length; i++) {
			if(vet1[i] % 2 == 0) {
				vetorResultante1[cont] = vet1[i];
				cont++;
			}
		}
		
		for(int i = 0; i < vetorResultante1.length; i++) {
			for(int o = 0; o < vet2.length; o++) {
				vetorResultante1[i] = vetorResultante1[i] + vet2[o];
			}
		}
		
	}
	
	public void preencheVetorResultante2(int[] vet1, int[] vet2, int[] vetorResultante2) {
		int cont, contVetor = 0;

		for(int i = 0; i < vet1.length; i++) {
			if((vet1[i] % 2) != 0) {
				vetorResultante2[contVetor] = vet1[i];
				contVetor++;
			}
		}
		
		for(int i = 0; i < vetorResultante2.length; i++) {
			cont = 0;
			for (int o = 0; o < vet2.length; o++) {
				if(vetorResultante2[i] % vet2[o] == 0) {
					cont++;
				}
			}
			vetorResultante2[i] = cont;
		}
	}
	//Até aqui vai o exercício 03
	
	//Exec 04
		public void geraContas (Banco[] contas) {
			for(int i = 0; i < contas.length; i++){
				contas[i].conta = (i+1);
			}
		}
		
		public void geraSaldo(Banco[] contas, double max) {
			Random random = new Random();
			for(int i = 0; i < contas.length; i++) {
				contas[i].saldo = random.nextDouble(max);
			}
		}
		
		public void numeroErrado() {
			System.out.println("Número digitado inválido. Por favor, tente novamente.\n");
		}
		
		public void programaEncerrado() {
			System.out.println("Programa encerrado.");
		}
		
		public void mostraSaldo(Banco[] contas, int escolhaConta) {
			System.out.printf("O saldo da sua conta é de R$%.2f reais.\n", contas[escolhaConta].saldo);
		}
		
		public void mostraAtivoBancario(Banco[] contas) {
			double ativoBancario = 0;
			for(int i = 0; i < contas.length; i++) {
				ativoBancario += contas[i].saldo;
			}
			System.out.printf("O ativo bancário é de %.2f reais no momento.\n", ativoBancario);
		}
		
		public void acaoBanco(int escolha, Banco[] contas, int escolhaConta) {
			Scanner input = new Scanner(System.in);
			Metodos metodo = new Metodos();
			double auxiliar1 = 0;
			int auxiliar2 = 11;
			if(escolha == 1) {
				System.out.print("Informe o quanto deseja transferir: ");
				auxiliar1 = input.nextDouble();
				if(auxiliar1 > contas[escolhaConta].saldo) {
					System.out.println("Impossível realizar a transferência. Saldo indisponível.");
				} else {
					System.out.print("Informe para qual conta deseja tranferir: ");
					do {
						auxiliar2 = input.nextInt();
						auxiliar2--;
						if(auxiliar2 > 9 || auxiliar2 < 0){
							metodo.numeroErrado();
						}
					} while(auxiliar2 > 9 || auxiliar2 < 0);
					contas[escolhaConta].saldo -= auxiliar1;
					contas[auxiliar2].saldo += auxiliar1;
				}
				metodo.mostraSaldo(contas, escolhaConta);
			} else if (escolha == 2){
				System.out.print("Informe o quanto deseja sacar: ");
				auxiliar1 = input.nextDouble();
				if(auxiliar1 > contas[escolhaConta].saldo) {
					System.out.println("Impossível realizar o saque. Saldo indisponível.\nRecomece a operação.\n");
				} else {
					contas[escolhaConta].saldo -= auxiliar1;
					metodo.mostraSaldo(contas, (escolhaConta));
				}
			} else if(escolha == 3) {
				metodo.mostraAtivoBancario(contas);
			} else {
				metodo.mostraSaldo(contas, escolhaConta);
				System.out.print("Informe o quanto deseja transferir: ");
				auxiliar1 = input.nextDouble();
				contas[escolhaConta].saldo += auxiliar1;
				metodo.mostraSaldo(contas, escolhaConta);
			}
		}
		//Até aqui vai o exercício 04
		//Aqui começa o 05
	public void preencheVetorLinhas(int[][] matriz, int[] vet1, int linhas, int colunas) {
		int cont = 0;
		for(int i = 0; i < linhas; i++) {
			for(int o = 0; o < colunas; o++) {
				if(o == 0) {
					vet1[cont] = matriz[i][o];
				} else if(matriz[i][o] > vet1[cont]){
					vet1[cont] = matriz[i][o];
				}
			}
			cont++;
		}
	}
	
	public void preencheVetorColunas(int[][] matriz, int[] vet2, int linhas, int colunas) {
		int cont = 0;
		for(int i = 0; i < linhas; i++) {
			for(int o = 0; o < colunas; o++) {
				if(o == 0) {
					vet2[cont] = matriz[o][i];
				} else if(matriz[o][i] < vet2[cont]){
					vet2[cont] = matriz[o][i];
				}
			}
			cont++;
		}
	}
		
}
