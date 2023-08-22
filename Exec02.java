package atividade02;

import java.util.Random;

public class Exec02 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int[] vet1 = new int[10];
		int[] vet2 = new int[10];
		int[] vet3 = new int[20];
		int max = 50, o, p = 0, countVet3 = 0;
		boolean diferente;
		
		for(int i = 0; i < vet1.length; i++) {
			vet1[i] = random.nextInt(max);
		}
		for(int i = 0; i < vet2.length; i++) {
			vet2[i] = random.nextInt(max);
		}
		for(int i = 0; i < vet3.length; i++) {
			vet3[i] = 0;
		}
		
		for(int i = 0; i < vet1.length; i++) {
			diferente = true;
			o = 0;
			while (o < vet2.length && diferente){
				if(vet1[i] == vet2[o]) {
					diferente = false;
				}
				o++;
			}
			if(diferente) {
				vet3[countVet3] = vet1[i];
				countVet3++;
			}
		}
		for(int i = 0; i < vet2.length; i++) {
			diferente = true;
			o = 0;
			while (o < vet1.length && diferente){
				if(vet2[i] == vet1[o]) {
					diferente = false;
				}
				o++;
			}
			if(diferente) {
				vet3[countVet3] = vet2[i];
				countVet3++;
			}
		}
		System.out.print("Números não comuns nos vetores: ");
		while (p < countVet3) {
			if(vet3[p+1] != 0) {
				System.out.printf("%d, ", vet3[p]);
			} else if(vet3[p+1] == 0 || p == vet3.length){
				System.out.printf("%d.", vet3[p]);
			}
			p++;
		}
	}
}
