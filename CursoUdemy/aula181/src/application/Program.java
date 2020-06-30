package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Produto> lista = new ArrayList<>();
		
		System.out.println("Informe o caminho do arquivo: ");
		
		String caminhoDoArquivo = sc.nextLine();
		
		File arquivo = new File(caminhoDoArquivo);
		String diretorio = arquivo.getParent();
			
		boolean sucesso = new File(caminhoDoArquivo + "\\out").mkdir();
				
		String arquivoDeSaida = caminhoDoArquivo + "\\out\\sumary.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(caminhoDoArquivo))){
			
			String linhaCSV = br.readLine();
			while(linhaCSV != null) {
				
				String[] campos = linhaCSV.split(",");
				String nome = campos[0];
				double preco = Double.parseDouble(campos[1]);
				int quantidade = Integer.parseInt(campos[2]);
				
				lista.add(new Produto(nome, preco, quantidade));
				
				linhaCSV = br.readLine();
					
			}
		
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoDeSaida))){
				
				for (Produto item : lista) {
					bw.write(item.getNome() + "," + String.format("%.2f", item.total()));
					bw.newLine();
				}
				
				System.out.println(arquivoDeSaida + " CRIADO!");
				
			}catch(IOException e) {
				System.out.println("Erro escrevendo o arquivo: " + e.getMessage());
			}
			
		}catch (IOException e) {
			System.out.println("Erro lendo arquivo: " + e.getMessage());
			
		}
		
		sc.close();

	}

}
