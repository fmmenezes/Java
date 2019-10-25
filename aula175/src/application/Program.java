package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File arquivo = new File("C:\\temp\\arquivoTeste.txt");
		Scanner sc = null;
		try {
		sc = new Scanner(arquivo);
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		}catch(IOException e){
			System.out.println("Erro: " + e.getMessage());
			
		}finally {
			sc.close();
		}

	}

}
