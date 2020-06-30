package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {
	
	private List<Integer> lista = new ArrayList<>();
	
	public void adicionaValor(Integer valor) {
		lista.add(valor);
	}
	
	public Integer first() {
		if(lista.isEmpty()) {
			throw new IllegalStateException("A lista está vazia!");
		}
		return lista.get(0);
	}
	
	public void print() {
		System.out.println("[");
		if (!lista.isEmpty()) {
			System.out.print(lista.get(0));
		}
		for (int i = 1; i < lista.size(); i++ ) {
			System.out.println(", " + lista.get(i));
		}
		System.out.println("]");
	}

}
