package entities;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double Amount(double dollar, double price) {
		
		double dollars = dollar * price;
		
		return dollars + (dollars * IOF);
	}

}
