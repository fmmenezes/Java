package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Aluguel;
import model.entities.Veiculo;
import model.services.ServicoAluguel;
import model.services.ServicoTaxa;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
		
		System.out.println("Informe os dados do aluguel");
		System.out.println("Modelo do Carro: ");
		String modeloCarro = sc.nextLine();
		System.out.println("Inicio da locação (dd/mm/yyy hh:ss): ");
		Date inicioLocacao = sdf.parse(sc.nextLine());
		System.out.println("Retorno da locacao (dd/mm/yyyy hh:ss): ");
		Date fimLocacao = sdf.parse(sc.nextLine());
		
		Aluguel al = new Aluguel(inicioLocacao, fimLocacao, new Veiculo(modeloCarro));
		
		System.out.println("Informe o preco por hora: ");
		double precoPorHora = sc.nextDouble();
		System.out.println("Informe o preco por dia: ");
		double precoPorDia = sc.nextDouble();
		
		ServicoAluguel sa = new ServicoAluguel(precoPorDia, precoPorHora, new ServicoTaxa());
		
		sa.processaFatura(al);
		
		System.out.println("FATURA: ");
		System.out.println("Valor da Locacao: " + String.format("%.2f", al.getFatura().getValorBasico()));
		System.out.println("Taxa: " + String.format("%.2f", al.getFatura().getTaxa()));		
		System.out.println("Valor Total: " + String.format("%.2f", al.getFatura().valorTotal()));		
		
		
		
		
		
		
		sc.close();

	}

}
