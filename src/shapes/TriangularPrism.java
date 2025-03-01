package shapes;

/**
 * An public class representing a triangular prism, extended from prism.
 * This class provides height and side length.
 * @param height of the shape
 * @param side length of the shape
 * @return calcVolume() returns the volume of the prism for use with a comparator.
 * @return calcBaseArea() returns the base area of the prism for use with a comparator.
 */
public class TriangularPrism extends Prism {

	// Constructor
	public TriangularPrism(double side, double height) {
		super(side, height);
	}

	// Override calcVolume & calcBaseArea

	@Override
	public double calcVolume() {
		return calcBaseArea() * getHeight(); // area * height
	}

	@Override
	public double calcBaseArea() {
		return (getSide() * getSide() * Math.sqrt(3)) / 4; // ( side^2 * sqrt(3) ) / 4
	}

	@Override
	public String toString() {
		return "Side: " + getSide() + " - Height: " + getHeight() + " - Area: " + calcBaseArea() + " - Volume: " + calcVolume();
	}

}
