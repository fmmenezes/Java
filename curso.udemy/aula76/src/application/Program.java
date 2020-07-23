package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Empregado;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Empregado> lista = new ArrayList<>();

		System.out.print("Quantos empregados serão registrados: ");
		int numeroEmpregados = sc.nextInt();

		for (int i = 1; i <= numeroEmpregados; i++) {

			System.out.println();
			System.out.println("Empregado #" + i + ": ");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salario: ");
			double salary = sc.nextDouble();
			lista.add(new Empregado(id, name, salary));

		}

		System.out.println();
		System.out.print("Informe o empregado que terá aumaneto de salário: ");
		int id = sc.nextInt();
		Empregado emp = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (emp == null) {

			System.out.println("Empregado não existe!!");

		}

		else {

			System.out.print("Informe o percentual: ");
			double percentage = sc.nextDouble();
			emp.aumentaSalario(percentage);

		}

		System.out.println();
		System.out.println("Lista de Empregados:");

		for (Empregado obj : lista) {

			System.out.println(obj);

		}

		sc.close();

	}

}
