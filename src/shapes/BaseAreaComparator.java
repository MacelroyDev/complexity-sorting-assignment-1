package shapes;

import java.util.Comparator;

/**
 * A Comparator for comparing Shape objects based on their base area.
 * This class implements the Comparator interface and provides a method to compare
 * two Shape objects by calculating their base area using the calcBaseArea() method.
 */
public class BaseAreaComparator implements Comparator<Shape> {

	 /**
     * Compares two Shape objects based on their calculated base area.
     *
     * @param s1 The first Shape object to compare.
     * @param s2 The second Shape object to compare.
     * @return A positive integer if s1's base area is greater than s2's base area,
     * a negative integer if s1's base area is less than s2's base area,
     * or zero if the base areas are equal.
     */
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
