package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Produto> listaProd = new ArrayList<>();
		
		System.out.print("Quantidade de produtos: ");
		int qtdeProd = sc.nextInt();
		
		for (int i=1; i<=qtdeProd; i++) {
			System.out.println("Produto #" + qtdeProd + " dados:");
			System.out.print("Comum, usado ou importado (c/u/i)? ");
			char tipoProd = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			if (tipoProd == 'c') {

				listaProd.add(new Produto(nome, preco));

			}

			else if (tipoProd == 'u') {

				System.out.print("Data de Fabricação (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());

				listaProd.add(new ProdutoUsado(nome, preco, date));

			}

			else {

				System.out.print("Taxa de Importação: ");

				double customsFee = sc.nextDouble();

				listaProd.add(new ProdutoImportado(nome, preco, customsFee));

			}
		
			
		}
		
		System.out.println();

		System.out.println("PRICE TAGS:");

		for (Produto prod : listaProd) {

			System.out.println(prod.precoEtiqueta());

		}

		
		sc.close();

	}

}
