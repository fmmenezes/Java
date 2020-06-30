package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.ContratoHora;
import entities.Departamento;
import entities.Trabalhador;
import entities.enums.NivelTrabalhador;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Entre com o nome do Departamento: ");
		String nomeDepartamento = sc.nextLine();
		System.out.println("Entre com os dados de Trabalhador");
		System.out.print("Nome: ");
		String nomeTrabalhador = sc.nextLine();
		System.out.println("Nível: ");
		String nivelTrabalhador = sc.nextLine();
		System.out.println("Salario Base: ");
		double salarioBase = sc.nextDouble();
		Trabalhador trabalhador =  new Trabalhador(nomeTrabalhador, NivelTrabalhador.valueOf(nivelTrabalhador), salarioBase, new Departamento(nomeDepartamento));
		
		System.out.println("Número de Contratos para este trabalahdor? ");
		int qtdeContratos = sc.nextInt();
		
		for(int i=1; i<=qtdeContratos; i++) {
			
			System.out.println("Informe o contrato #" + i + " Dados :");
			System.out.print("Data (DD/MM/YYYY): ");
			Date dataContrato = sdf.parse(sc.next());
			System.out.println("Valor hora: ");
			double valorHora = sc.nextDouble();
			System.out.print("Duração (horas): ");
			int horas = sc.nextInt();
			ContratoHora contrato = new ContratoHora(dataContrato, valorHora, horas);
			trabalhador.addContrato(contrato);
						
		}
		
		System.out.println();
		System.out.print("Entre com o mes e o ano para calcular o salario (MM/YYYY): ");
		String monthAndYear = sc.next();
		
		int mes = Integer.parseInt(monthAndYear.substring(0,2));
		int ano = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Nome: " + trabalhador.getNome());
		System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
		System.out.println("Salario para: " + monthAndYear + ": " + String.format("%.2f", trabalhador.income(ano, mes)));
			
		sc.close();

	}

}
