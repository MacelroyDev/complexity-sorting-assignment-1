package shapes;

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

	public double calcBaseArea() {
		return Math.PI * radius * radius;
	}

}
