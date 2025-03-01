package shapes;

/**
 * An public class representing a pyramid.
 * This class provides height, side, and 2 methods being
 * calcVolume() and calcBaseArea().
 * @param height of the pyramid
 * @param side length of the pyramid
 * @return calcVolume() returns the volume of the pyramid for use with a comparator.
 * @return calcBaseArea() returns the base area of the pyramid for use with a comparator.
 */
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
