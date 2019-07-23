package application;

import java.util.Locale;
import java.util.Scanner;

class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Informe o numero da conta: ");
		int conta = sc.nextInt();
		System.out.print("Informe o nome do titular: ");
		String titular = sc.next();
		System.out.print("Existe deposito inicial (y/n)? ");
		String flagDeposito = sc.next();
		System.out.print("Infore o valor do deposito: ");
		double valorDeposito = sc.nextDouble();
		
		sc.close();

	}

}
