package atividade02;


public class Banco {
		int conta;
		double saldo;
		
		public Banco(int conta) {
			this(conta,0);
		}
		
		public Banco(int conta, double saldo){
			this.conta = conta;
			this.saldo = saldo;
		}
}
