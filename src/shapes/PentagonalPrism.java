package shapes;

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

	public double calcBaseArea() { // DOUBLE CHECK THIS ONE!!! since it's a lot longer than the others
		return (5 * (getSide() * getSide()) * Math.tan(Math.toRadians(54))) / 4; // (5 * side^2 * tan(54)) / 4
	}

}
