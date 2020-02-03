package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Empregado;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// List<String> lista = new ArrayList<>();
		List<Empregado> lista = new ArrayList<>();
		String caminhoDoArquivo = "C:\\workspace\\eclipse\\udemy-java\\192InterfaceComparable\\arquivo\\in2.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(caminhoDoArquivo))){
			
			// String nome = br.readLine();
			String empregadoCsv = br.readLine();

			while (empregadoCsv != null) {
				String[] linhaEmpregado = empregadoCsv.split(",");
				lista.add(new Empregado(linhaEmpregado[0],Double.parseDouble(linhaEmpregado[1])));
				empregadoCsv = br.readLine();
			}
			
			Collections.sort(lista);
			
			for(Empregado linha: lista) {
				System.out.println(linha.getNome() + ", " + linha.getSalario());
				
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
			
		}

	}

}
