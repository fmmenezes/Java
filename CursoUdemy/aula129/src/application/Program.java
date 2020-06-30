package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circulo;
import entities.Forma;
import entities.Retangulo;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		List<Forma> lista = new ArrayList();
		
		System.out.print("Informe a quabtidade de formas: ");
		int quantidade = sc.nextInt();
		
		for(int i=1; i<=quantidade; i++) {
			
			System.out.println("Forma #" + i + " dados:");
			System.out.print("Retangulo ou Circulo (r/c)?");
			char tipo = sc.next().charAt(0);
			System.out.print("Cor (Preto/Azul/Vermelho): ");
			Color cor = Color.valueOf(sc.next());
			
			if(tipo == 'r') {
				System.out.print("Largura: ");
				double largura = sc.nextDouble();
				System.out.print("Altura: ");
				double altura = sc.nextDouble();
				
				lista.add(new Retangulo(cor, altura, largura));
				
			}else {
				System.out.print("Raio: ");
				double raio = sc.nextDouble();
				
				lista.add(new Circulo(cor, raio));
			}
			
			
		}
		
		System.out.println("Area das Formas: ");
		
		for (Forma frm : lista) {
			System.out.println(String.format("%.2f", frm.area()));
		}
		
		sc.close();

	}

}
