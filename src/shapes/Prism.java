package shapes;

public abstract class Prism extends Shape {
	// Set vars
	private double side;

	// Constructor
	public Prism(double side, double height) {
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
	
	// I don't think I need to re-add the compareTo method

}
