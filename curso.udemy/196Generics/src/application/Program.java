package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		PrintService ps = new PrintService();
		
		System.out.println("Inforne os valore: ");
		int valores = sc.nextInt();
		
		for (int i=0; i < valores; i++) {
			int valor = sc.nextInt();
			ps.adicionaValor(valor);
		}
		
		ps.print();
		System.out.println("Primeiro valor: " + ps.first());
		
		sc.close();

	}

}
