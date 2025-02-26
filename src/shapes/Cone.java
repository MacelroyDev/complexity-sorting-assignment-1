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

	// Override calcVolume & calcBaseArea for cylinder class

	@Override
	public double calcVolume() {
		return (1 / 3) * Math.PI * radius * radius * getHeight(); // Test this to make sure the (1/3) works as intended
	}

	public double calcBaseArea() {
		return Math.PI * radius * radius;
	}
}
