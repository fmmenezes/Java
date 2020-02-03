package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> lista = new ArrayList<>();
		String caminhoDoArquivo = "C:\\workspace\\eclipse\\udemy-java\\192InterfaceComparable\\arquivo\\in.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(caminhoDoArquivo))){
			
			String nome = br.readLine();
			while (nome != null) {
				lista.add(nome);
				nome = br.readLine();
			}
			
			Collections.sort(lista);
			
			for(String linha: lista) {
				System.out.println(linha);
				
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
			
		}

	}

}
