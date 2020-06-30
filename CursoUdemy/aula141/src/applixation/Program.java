package applixation;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Conta;
import model.exceptions.DomainExceptions;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o numero da conta");
		System.out.print("Numero: ");
		int numero = sc.nextInt();
		System.out.print("Titular: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Saldo Inicial: ");
		double saldo = sc.nextDouble();
		System.out.print("Limite de Saque: ");
		double limiteSaque = sc.nextDouble();
		
		Conta cta = new Conta(numero,titular,saldo,limiteSaque);
		
		System.out.println();
		System.out.print("Informe o valor para saque: ");
		double valor = sc.nextDouble();
		
		try {
			cta.saque(valor);
			System.out.println("Saldo: " + String.format("%.2f", cta.getSaldo()));
		}
		catch(DomainExceptions e) {
			System.out.println("Erro no Saque: " + e.getMessage());
			
		}
		
		sc.close();

	}

}
