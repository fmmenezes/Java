package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Empregado;
import entities.Terceirizado;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Empregado> listEmp = new ArrayList<>();

		System.out.println("Numero de empregados: ");
		int numeroEmp = sc.nextInt();
		
		for(int i=1; i<=numeroEmp; i++) {
			
			System.out.println("Empregado #" + numeroEmp + " data:");
			System.out.println("Terceirizado: (y/n)? ");
			char flagTerc = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Horas: ");
			int hora = sc.nextInt();
			sc.nextLine();
			System.out.print("Valor hora: ");
			double valorHora = sc.nextDouble();
			sc.nextLine();
			if( flagTerc == 'y') {
				System.out.print("Despesa adicional: ");
				double valorAdicional = sc.nextDouble();
				Empregado empr = new Terceirizado(nome, hora, valorHora, valorAdicional);
				listEmp.add(empr);
			}else {
				Empregado empr = new Empregado(nome, hora, valorHora);
				listEmp.add(empr);
			}
			
			System.out.println();
			
			
		}
		
		System.out.println("Pagamentos: ");
		
		for(Empregado empr : listEmp) {
			System.out.println(empr.getNome() + " - $ " + String.format("%.2f", empr.pagamento()));
		}
		
		sc.close();

	}

}
