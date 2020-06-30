package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.AluguelCarro;
import model.entities.Veiculo;
import model.services.BrasilTaxaServico;
import model.services.ServicoAluguel;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated= method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy HH:ss");
		
		System.out.println("Dados da locação:");
		System.out.println("Modelo do carro: ");
		String modeloDoCarro = sc.nextLine();
		System.out.println("Data da retirada [DD/MM/YYYY HH:SS]: ");
		Date inicioDaLocacao = sdf.parse(sc.nextLine());
		System.out.println("Data do retorno [DD/MM/YYYY HH:SS]: ");
		Date fimDaLocacao = sdf.parse(sc.nextLine());
		
		AluguelCarro ac = new AluguelCarro(inicioDaLocacao, fimDaLocacao, new Veiculo(modeloDoCarro) );
		
		System.out.println("Informe o preço por hora: ");
		double precoPorHora = sc.nextDouble();
		System.out.println("Informe o preço por dia: ");
		double precoPorDia = sc.nextDouble();
		
		ServicoAluguel sa = new ServicoAluguel(precoPorDia, precoPorHora, new BrasilTaxaServico());
		
		sa.processaPagamento(ac);
		
		System.out.println("Pagamento:");
		System.out.println("Valor bruto: " + String.format("%.2f", ac.getPagamento().getPagamento()));
		System.out.println("Taxa: " + String.format("%.2f", ac.getPagamento().getTaxa()));
		System.out.println("Total: " + String.format("%2f", ac.getPagamento().totalPagamento()));
		
		sc.close();

	}

}

