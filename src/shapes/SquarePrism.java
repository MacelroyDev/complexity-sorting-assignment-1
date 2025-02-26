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

	public double calcBaseArea() {
		return getSide() * getSide();
	}

}
