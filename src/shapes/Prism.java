package shapes;

/**
 * An abstract class representing a basic prism, extended from shape.
 * This class provides height and side length.
 * @param height of the shape
 * @param side length of the shape
 */
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
	

}
