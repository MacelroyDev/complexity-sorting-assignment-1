package shapes;

/**
 * An public class representing a cylinder.
 * This class provides height, radius, and 2 methods being
 * calcVolume() and calcBaseArea().
 * @param height of the cylinder
 * @param radius of the cylinder
 * @return calcVolume() returns the volume of the cylinder for use with a comparator.
 * @return calcBaseArea() returns the base area of the cylinder for use with a comparator.
 */
public class Cylinder extends Shape {
	// Set vars
	private double radius;

	// Constructor
	public Cylinder(double radius, double height) {
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

	// Override calcVolume & calcBaseArea for cylinder class

	@Override
	public double calcVolume() {
		return Math.PI * radius * radius * getHeight(); // I could probably do ^2 better but this will work too
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
