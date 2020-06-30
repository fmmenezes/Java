package application;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] vect = new String[] {"Aline","Suzana","Patrícia","Pamela"};
		
		for(int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("-------------");
		for(String valor : vect) {
			System.out.println(valor);
		}

	}

}
