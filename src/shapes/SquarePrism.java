package shapes;

/**
 * An public class representing a square prism, extended from prism.
 * This class provides height and side length.
 * @param height of the shape
 * @param side length of the shape
 * @return calcVolume() returns the volume of the prism for use with a comparator.
 * @return calcBaseArea() returns the base area of the prism for use with a comparator.
 */
public class SquarePrism extends Prism {

	// Constructor
	public SquarePrism(double side, double height) {
		super(side, height);
	}

	// Override calcVolume & calcBaseArea

	@Override
	public double calcVolume() {
		return getSide() * getSide() * getHeight();
	}

	@Override
	public double calcBaseArea() {
		return getSide() * getSide();
	}
	
	@Override
	public String toString() {
		return "Side: " + getSide() + " - Height: " + getHeight() + " - Area: " + calcBaseArea() + " - Volume: " + calcVolume();
	}

}
