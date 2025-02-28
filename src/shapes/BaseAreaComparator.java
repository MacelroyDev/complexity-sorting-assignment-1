package shapes;

import java.util.Comparator;

public class BaseAreaComparator implements Comparator<Shape> {

	@Override
	public int compare(Shape s1, Shape s2) {
		
		// Get the area of both shapes
		double areaA = s1.calcBaseArea();
		double areaB = s2.calcBaseArea();

		// Return value based on which base area is greater than the other
		if (areaA > areaB) {
			return 1;
		} else if (areaA < areaB) {
			return -1;
		} else {
			return 0;
		}

	}
}
