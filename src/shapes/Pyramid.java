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

	// Override calcVolume & calcBaseArea for cylinder class

	@Override
	public double calcVolume() {
		return (1 / 3) * side * side * getHeight(); // Test this to make sure the (1/3) works as intended here too
	}

	public double calcBaseArea() {
		return side * side;
	}
}
