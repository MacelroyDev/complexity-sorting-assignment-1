package shapes;

/**
 * An public class representing a pentagonal prism, extended from prism.
 * This class provides height and side length.
 * @param height of the shape
 * @param side length of the shape
 * @return calcVolume() returns the volume of the prism for use with a comparator.
 * @return calcBaseArea() returns the base area of the prism for use with a comparator.
 */
public class PentagonalPrism extends Prism {

	// Constructor
	public PentagonalPrism(double side, double height) {
		super(side, height);
	}

	// Override calcVolume & calcBaseArea

	@Override
	public double calcVolume() {
		return calcBaseArea() * getHeight(); // area * height
	}

	@Override
	public double calcBaseArea() { // DOUBLE CHECK THIS ONE!!! since it's a lot longer than the others
		return (5 * (getSide() * getSide()) * Math.tan(Math.toRadians(54))) / 4; // (5 * side^2 * tan(54)) / 4
	}
	
	@Override
	public String toString() {
		return "Side: " + getSide() + " - Height: " + getHeight() + " - Area: " + calcBaseArea() + " - Volume: " + calcVolume();
	}

}
