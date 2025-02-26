package shapes;

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
