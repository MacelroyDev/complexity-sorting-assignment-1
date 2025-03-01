package shapes;

/**
 * An public class representing a octagonal prism, extended from prism.
 * This class provides height and side length.
 * @param height of the shape
 * @param side length of the shape
 * @return calcVolume() returns the volume of the prism for use with a comparator.
 * @return calcBaseArea() returns the base area of the prism for use with a comparator.
 */
public class OctagonalPrism extends Prism {

	// Constructor
	public OctagonalPrism(double side, double height) {
		super(side, height);
	}

	// Override calcVolume & calcBaseArea

	@Override
	public double calcVolume() {
		return calcBaseArea() * getHeight(); // area * height
	}

	@Override
	public double calcBaseArea() {
		return 2 * (1 + Math.sqrt(2)) * (getSide() * getSide()); // 2 * (1 + sqrt(2)) * side^2
	}
	
	@Override
	public String toString() {
		return "Side: " + getSide() + " - Height: " + getHeight() + " - Area: " + calcBaseArea() + " - Volume: " + calcVolume();
	}

}
