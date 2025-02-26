package shapes;

public class Pyramid extends Shape {
	// Set vars
	private double side;

	// Constructor
	public Pyramid(double side, double height) {
		super(height);
		this.side = side;
	}

	// Getters & Setters
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	// Override calcVolume & calcBaseArea

	@Override
	public double calcVolume() {
		return (side * side * getHeight())/3; // Fixed, divide by 3 instead of multiplying by 1/3
	}

	@Override
	public double calcBaseArea() {
		return side * side;
	}
	
	@Override
	public String toString() {
		return "Side: " + getSide() + " - Height: " + getHeight() + " - Area: " + calcBaseArea() + " - Volume: " + calcVolume();
	}
}
