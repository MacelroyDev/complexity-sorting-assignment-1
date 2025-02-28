package shapes;


/**
 * An abstract class representing a basic shape.
 * This class provides height, a compareTo method for comparing height
 * and 2 abstract methods of calculating volume and base area.
 */
public abstract class Shape implements Comparable<Shape> {

	// Set vars
	private double height;

	// Constructor (I'm really bad at forgetting to add these -Mace)
	public Shape(double height) {
		this.height = height;
	}

	// Abstract methods
	public abstract double calcVolume();

	public abstract double calcBaseArea();

	// Getters & Setters
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	// Compare to method
	@Override
	public int compareTo(Shape s) {
		if (this.getHeight() > s.getHeight())
			return 1;
		else if (this.getHeight() < s.getHeight())
			return -1;
		else
			return 0;
	}
	
}
