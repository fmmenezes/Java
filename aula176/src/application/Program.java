package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arquivo = "C:\\temp\\arquivoTeste.txt";
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
		fr = new FileReader(arquivo);
		br = new BufferedReader(fr);
		
		String linha = br.readLine();
		
		while(linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		}catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}finally {
			try {
				if(br != null)
					br.close();
				if(fr != null)
					fr.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
		
		

	}

}
