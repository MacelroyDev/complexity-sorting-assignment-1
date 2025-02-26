package shapes;

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
