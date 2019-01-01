package entities;

public class Rectangle {

	public double bMenor;
	public double bMaior;
	
	public double area() {
		return bMenor * bMaior;
	}
	
	public double perimetro() {
		return 2*(bMenor + bMaior);
	}
	public double diagonal() {
		return Math.sqrt(bMenor*bMenor + bMaior* bMaior);
	}


}
