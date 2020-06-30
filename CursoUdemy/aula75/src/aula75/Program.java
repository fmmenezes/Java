package aula75;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lista = new ArrayList<>();

		lista.add("Luciana");
		lista.add("Valeria");
		lista.add("Cintia");
		lista.add("Silvia");
		lista.add("Marisa");
		lista.add(2, "Paula");

		System.out.println(lista.size());

		lista.remove("Luciana");
		lista.remove(1);
		lista.removeIf(x -> x.charAt(0) == 'M');

		for (String x : lista) {
			System.out.println(x);

		}

		System.out.println("Silvia esta na posição: " + lista.indexOf("Silvia"));
		System.out.println("Lucia esta na posição: " + lista.indexOf("Lucia"));

		List<String> resultado = lista.stream().filter(x -> x.charAt(0) == 'V').collect(Collectors.toList());

		for (String y : resultado) {
			System.out.println(y);

		}
		
		String name = lista.stream().filter(x -> x.charAt(0) == 'S').findFirst().orElse(null);
		System.out.println(name);

	}

}
