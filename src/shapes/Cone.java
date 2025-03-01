package shapes;

/**
 * An public class representing a cone.
 * This class provides height, radius, and 2 methods being
 * calcVolume() and calcBaseArea().
 * @param height of the cone
 * @param radius of the cone
 * @return calcVolume() returns the volume of the cone for use with a comparator.
 * @return calcBaseArea() returns the base area of the cone for use with a comparator.
 */
public class Cone extends Shape {
	// Set vars (Same vars as cylinder)
	private double radius;

	// Constructor
	public Cone(double radius, double height) {
		super(height);
		this.radius = radius;
	}

	// Getters & Setters
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// Override calcVolume & calcBaseArea

	@Override
	public double calcVolume() {
		return ( Math.PI * radius * radius * getHeight()/3); // Fixed, divide by 3 instead of multiplying by 1/3
	}

	@Override
	public double calcBaseArea() {
		return Math.PI * radius * radius;
	}
	
	@Override
	public String toString() {
		return "Radius: " + getRadius() + " - Height: " + getHeight() + " - Area: " + calcBaseArea() + " - Volume: " + calcVolume();
	}
}
