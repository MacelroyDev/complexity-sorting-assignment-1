package shapes;

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

	public double calcBaseArea() {
		return (getSide() * getSide() * Math.sqrt(3)) / 4; // ( side^2 * sqrt(3) ) / 4
	}

}
