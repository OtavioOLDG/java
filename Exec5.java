package olamundo9;

import java.util.Scanner;

public class Exec5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int line = 5, col = 11, qUnderAge = 0, i, o;
		int[][] age = new int[line][col];
		double[][] weight = new double[line][col];
		double[][] stature = new double[line][col];
		double[] avgTeamAge = new double[line];
		double avgChampionshipHigh = 0, percentage80kg = 0;
		
		for(i = 0; i < line; i++) {
			for(o = 0; o < col; o++) {
				System.out.printf("Digite a idade do %dº jogador do %dº time: ", o+1, i+1);
				age[i][o] = input.nextInt();
				System.out.printf("Digite a altura do %dº jogador do %dº time: ", o+1, i+1);
				stature[i][o] = input.nextDouble();
				System.out.printf("Digite o peso do %dº jogador do %dº time: ", o+1, i+1);
				weight[i][o] = input.nextDouble();
				if(age[i][o] < 18) {
					qUnderAge++;
				}
				if(weight[i][o] > 80) {
					percentage80kg++;
				}
				avgTeamAge[i] += age[i][o];
				avgChampionshipHigh += stature[i][o];
			}
			avgTeamAge[i] /= col;
		}
		System.out.printf("Quantidade de jogadores menores de 18 anos: %d jogador(es);\n", qUnderAge);
		for(i = 0; i < line; i++) {
			System.out.printf("Média de idade do time %d: %.2f anos;\n", i+1, avgTeamAge[i]);
		}
		percentage80kg = ((percentage80kg / (line * col)) * 100);
		avgChampionshipHigh = avgChampionshipHigh / (line * col);
		System.out.printf("Média de altura do campeonato: %.2fm;\n", avgChampionshipHigh);
		System.out.printf("Porcentagem de jogadores com mais de 80kg: %.2f%%;\n", percentage80kg);
	}

}
