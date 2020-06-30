package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price?");
		double price = sc.nextDouble();
		System.out.print("How many dollars will be bought?");
		double dollar = sc.nextDouble();
		double media = CurrencyConverter.Amount(dollar, price);
		System.out.printf("Amount to be paid in reais = %.2f%n" , media);
				
		sc.close();
	}

}
