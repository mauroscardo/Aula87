package entities;

public class CurrencyConverter {
	public static final double IOF = 0.06;

	public static double convert(double qtDolar, double cambio) {
		return qtDolar * cambio * (1 + IOF);
	}

}
