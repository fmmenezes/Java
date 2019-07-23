package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaCorrente;

class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		ContaCorrente cc = new ContaCorrente();
		
		double valorDeposito = 0.00;

		System.out.print("Informe o numero da conta: ");
		int conta = sc.nextInt();
		cc.conta = conta;
		System.out.print("Informe o nome do titular: ");
		String titular = sc.next();
		cc.titular = titular;
		System.out.print("Existe deposito inicial (y/n)? ");
		
		char flagDeposito = sc.next().charAt(0);
		if (flagDeposito == 'Y') {
			
			System.out.print("Informe o valor do deposito: ");
			valorDeposito = sc.nextDouble();
			cc.deposito(valorDeposito);
		}
		
		System.out.println();
		//Continua a partir deste ponto 
		System.out.println(cc);

		sc.close();

	}

}
