package olamundo9;

import java.util.Scanner;

public class Exec910 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    int n1, n2, aux, cont;
	    boolean reveladora = true;
	    
	    System.out.printf("Digite dois números naturais. Você verá quais números dentre o intervalo escolhido são primos.\nn1: ");
	    n1 = input.nextInt();
	    System.out.printf("n2: ");
	    n2 = input.nextInt();

	    if((n1 >= n2) && (n2 >= 0)){
	        aux = n1;
	        n1 = n2;
	        n2 = aux;
	    }
	    if((n1>=0 && n2>0) || (n1>0 && n2>=0)){
	        while(n1 <= n2){
	        	cont = 2;
	            while(cont < n1 && reveladora){
	                if((n1 % cont) == 0){
	                    reveladora = false;
	                }
	                cont++;
	            }
	            if(reveladora && n1>1){
	                System.out.printf("%d é um número primo.\n", n1);
	            }
	            n1++;
	            reveladora = true;
	        }
	    }
	    else if(((n1 == n2) && (n2 == 0)) || ((n1 < 0) || (n2 < 0))){
	    	System.out.printf("Algum ou ambos dos valores digitados não preenchem os requisitos para fornecer qualquer número primo.\nReinicie o programa.\n");
	    }
	    input.close();
	}

}
