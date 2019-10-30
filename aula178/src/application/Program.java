package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] linhas = new String[] {"linha 1","linha 2","linha 3"};
		String caminhoDoArquivo = "C:\\temp\\ArquivoCriado.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoDoArquivo))) {
			for(String linha : linhas) {
				bw.write(linha);
				bw.newLine();
				
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
