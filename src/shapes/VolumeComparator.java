package shapes;

import java.util.Comparator;

/**
 * A Comparator for comparing Shape objects based on their volume.
 * This class implements the Comparator interface and provides a method to compare
 * two Shape objects by calculating their volumes using the calcVolume() method.
 */
public class VolumeComparator implements Comparator<Shape> {

	 /**
     * Compares two Shape objects based on their calculated volumes.
     *
     * @param s1 The first Shape object to compare.
     * @param s2 The second Shape object to compare.
     * @return A positive integer if s1's volume is greater than s2's volume,
     * a negative integer if s1's volume is less than s2's volume,
     * or zero if the volumes are equal.
     */
	@Override
	public int compare(Shape s1, Shape s2) {
		
		// Get the volume of both shapes
		double volA = s1.calcVolume();
		double volB = s2.calcVolume();

		// Return value based on which volume is greater than the other
		if (volA > volB) {
			return 1;
		} else if (volA < volB) {
			return -1;
		} else {
			return 0;
		}

	}
}
