package shapes;

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
