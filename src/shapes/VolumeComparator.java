package shapes;

import java.util.Comparator;

public class VolumeComparator implements Comparator<Shape> {

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
