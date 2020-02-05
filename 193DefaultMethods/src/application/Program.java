package application;

import java.util.Locale;
import java.util.Scanner;

import services.ServicoJurosBrasil;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Valor: ");
		double valorPagamento = sc.nextDouble();
		
		System.out.println("Meses: ");
		int quantidadeMeses = sc.nextInt();
		
		ServicoJurosBrasil sjb = new ServicoJurosBrasil(2.0);
		double valorTotal = sjb.pagamento(valorPagamento, quantidadeMeses);
		
		System.out.println("Apos Pagamento " + quantidadeMeses + " meses:");
		System.out.println(String.format("%.2f", valorTotal));
		
		
		sc.close();

	}

}
