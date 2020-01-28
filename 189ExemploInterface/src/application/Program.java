package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contrato;
import entities.Parcela;
import services.ServicoContrato;
import services.ServicoPaypal;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Informe os dados do contrato");
		System.out.print("Number: ");
		int numeroContrato = sc.nextInt();
		System.out.print("Data do contrato:");
		Date dataContrato = sdf.parse(sc.next());
		System.out.print("Valor do contrato:");
		Double valorContrato = sc.nextDouble();
		
		Contrato contrato = new Contrato(numeroContrato, dataContrato, valorContrato);
		
		System.out.print("Informe a quantidade de paercelas: ");
		int qtdeParcelas = sc.nextInt();
		
		ServicoContrato servicoContrato = new ServicoContrato(new ServicoPaypal());
		
		servicoContrato.processaContrato(contrato, qtdeParcelas);
		
		System.out.println("Parcelas: ");
		for (Parcela x : contrato.getParcelas()) {
			System.out.println(x);
		}

	}

}
