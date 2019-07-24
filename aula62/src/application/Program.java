package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaCorrente;

class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// ContaCorrente cc = new ContaCorrente();
		ContaCorrente cc;

		double valorDeposito = 0.00;

		System.out.print("Informe o numero da conta: ");
		int conta = sc.nextInt();
		// cc.conta = conta;
		System.out.print("Informe o nome do titular: ");
		sc.nextLine();
		String titular = sc.nextLine();
		// cc.titular = titular;

		System.out.print("Existe deposito inicial (y/n)? ");

		char flagDeposito = sc.next().charAt(0);
		if (flagDeposito == 'Y' || flagDeposito == 'y') {

			System.out.print("Informe o valor do deposito: ");
			valorDeposito = sc.nextDouble();
			cc = new ContaCorrente(conta, titular, valorDeposito);
			// cc.deposito(valorDeposito);
		} else {
			cc = new ContaCorrente(conta, titular);
		}

		System.out.println();

		System.out.println("Dados da conta:");
		System.out.println(cc);
		System.out.println();

		System.out.print("Informe o valor do deposito: ");
		valorDeposito = sc.nextDouble();
		cc.deposito(valorDeposito);
		System.out.println("Dados da conta atualizados: ");
		System.out.println(cc);

		System.out.println();

		System.out.print("Informe o valor do saque: ");
		double valorSaque = sc.nextDouble();
		cc.saque(valorSaque);
		System.out.println("Dados da conta atualizados: ");
		System.out.println(cc);

		sc.close();

	}

}
