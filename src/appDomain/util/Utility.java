package appDomain.util;

import java.util.Comparator;
import java.util.Arrays;
import shapes.Shape;
import shapes.BaseAreaComparator;
import shapes.VolumeComparator;

/**
 * Provides sorting algorithms for Shape arrays.
 * 
 * This utility class contains implementations of various sorting algorithms
 * that can be used to sort arrays of Shape objects based on their height,
 * volume, or base area.
 * 
 */
public class Utility {
	/**
	 * Sorts an array of shapes using the bubble sort algorithm.
	 * 
	 * This method implements the bubble sort algorithm to sort the shapes in
	 * descending order based on the specified property (height, volume, or base
	 * area).
	 * 
	 * @param shapes   The array of Shape objects to sort
	 * @param unitType The property to sort by (h=height, v=volume, a=base area)
	 * @return The sorted array of Shape objects
	 */
	public static Shape[] bubbleSort(Shape[] shapes, char unitType) {
		int n = shapes.length;
		int sortedCount = 1;
		Comparator<Shape> comparator = null; // Declare comparator

		System.out.printf("%-20s %-25s %-10f%n", "First element:", shapes[0].getClass().getSimpleName(),
				(unitType == 'h' ? shapes[0].getHeight()
						: unitType == 'v' ? shapes[0].calcVolume() : shapes[0].calcBaseArea()));

		// Set comparator based on args

		if (unitType == 'h') {
			comparator = Comparator.naturalOrder(); // natural order uses the Comparable written in shapes class
		} else if (unitType == 'v') {
			comparator = new VolumeComparator();
		} else if (unitType == 'a') {
			comparator = new BaseAreaComparator();
		}

		// Loop through shapes based using the comparator

		for (int i = 0; i < n - 1; i++) {
			for (int x = 0; x < n - i - 1; x++) {

				int comparison = 0;
				comparison = comparator.compare(shapes[x], shapes[x + 1]);

				if (comparison < 0) {
					Shape temp = shapes[x];
					shapes[x] = shapes[x + 1];
					shapes[x + 1] = temp;
				}
			}
			sortedCount++;
			if (sortedCount % 1000 == 0) {
				System.out.printf("%-20s %-25s %-10f%n", sortedCount + "-th element:",
						shapes[n - i - 1].getClass().getSimpleName(), (unitType == 'h' ? shapes[n - i - 1].getHeight()
								: unitType == 'v' ? shapes[n - i - 1].calcVolume() : shapes[n - i - 1].calcBaseArea()));
			}

		}
		System.out.printf("%-20s %-25s %-10f%n", "Last element:", shapes[n - 1].getClass().getSimpleName(),
				(unitType == 'h' ? shapes[n - 1].getHeight()
						: unitType == 'v' ? shapes[n - 1].calcVolume() : shapes[n - 1].calcBaseArea()));

		return shapes;
	}

	/**
	 * Sorts an array of shapes using the insertion sort algorithm.
	 * 
	 * This method implements the insertion sort algorithm to sort the shapes in
	 * descending order based on the specified property (height, volume, or base
	 * area).
	 * 
	 * @param shapes   The array of Shape objects to sort
	 * @param unitType The property to sort by (h=height, v=volume, a=base area)
	 * @return The sorted array of Shape objects
	 */
	public static Shape[] insertionSort(Shape[] shapes, char unitType) {
		int n = shapes.length;
		int sortedCount = 1;
		Comparator<Shape> comparator = null; // Declare comparator

		System.out.printf("%-20s %-25s %-10.3f%n", "First element:", shapes[0].getClass().getSimpleName(),
				(unitType == 'h' ? shapes[0].getHeight()
						: unitType == 'v' ? shapes[0].calcVolume() : shapes[0].calcBaseArea()));

		// Set comparator based on args

		if (unitType == 'h') {
			comparator = Comparator.naturalOrder(); // natural order uses the Comparable written in shapes class
		} else if (unitType == 'v') {
			comparator = new VolumeComparator();
		} else if (unitType == 'a') {
			comparator = new BaseAreaComparator();
		}

		for (int i = 1; i < n; i++) {
			Shape index = shapes[i];
			int j = i - 1;

			while (j >= 0) {
				int comparison = 0;
				comparison = comparator.compare(shapes[j], index);

				if (comparison < 0) {
					shapes[j + 1] = shapes[j];
					j = j - 1;
				} else {
					break;
				}
			}

			shapes[j + 1] = index;
			sortedCount++;

			if (sortedCount % 1000 == 0) {
				System.out.printf("%-20s %-25s %-10.3f%n", sortedCount + "-th element:",
						shapes[j + 1].getClass().getSimpleName(), (unitType == 'h' ? shapes[j + 1].getHeight()
								: unitType == 'v' ? shapes[j + 1].calcVolume() : shapes[j + 1].calcBaseArea()));
			}
		}

		System.out.printf("%-20s %-25s %-10.3f%n", "Last element:", shapes[n - 1].getClass().getSimpleName(),
				(unitType == 'h' ? shapes[n - 1].getHeight()
						: unitType == 'v' ? shapes[n - 1].calcVolume() : shapes[n - 1].calcBaseArea()));

		return shapes;
	}

	/**
	 * Sorts an array of shapes using the selection sort algorithm.
	 * 
	 * This method implements the selection sort algorithm to sort the shapes in
	 * descending order based on the specified property (height, volume, or base
	 * area).
	 * 
	 * @param shapes   The array of Shape objects to sort
	 * @param unitType The property to sort by (h=height, v=volume, a=base area)
	 * @return The sorted array of Shape objects
	 */
	public static Shape[] selectionSort(Shape[] shapes, char unitType) {
		int n = shapes.length;
		int sortedCount = 1;
		Comparator<Shape> comparator = null; // Declare comparator

		System.out.printf("%-20s %-25s %-10.3f%n", "First element:", shapes[0].getClass().getSimpleName(),
				(unitType == 'h' ? shapes[0].getHeight()
						: unitType == 'v' ? shapes[0].calcVolume() : shapes[0].calcBaseArea()));

		// Set comparator based on args

		if (unitType == 'h') {
			comparator = Comparator.naturalOrder(); // natural order uses the Comparable written in shapes class
		} else if (unitType == 'v') {
			comparator = new VolumeComparator();
		} else if (unitType == 'a') {
			comparator = new BaseAreaComparator();
		}

		for (int i = 0; i < n - 1; i++) {
			int maxIndex = i;

			for (int j = i + 1; j < n; j++) {
				int comparison = 0;
				comparison = comparator.compare(shapes[j], shapes[maxIndex]);

				if (comparison > 0) {
					maxIndex = j;
				}
			}

			Shape temp = shapes[i];
			shapes[i] = shapes[maxIndex];
			shapes[maxIndex] = temp;

			sortedCount++;
			if (sortedCount % 1000 == 0) {
				System.out.printf("%-20s %-25s %-10.3f%n", sortedCount + "-th element:",
						shapes[i].getClass().getSimpleName(), (unitType == 'h' ? shapes[i].getHeight()
								: unitType == 'v' ? shapes[i].calcVolume() : shapes[i].calcBaseArea()));
			}
		}

		System.out.printf("%-20s %-25s %-10.3f%n", "Last element:", shapes[n - 1].getClass().getSimpleName(),
				(unitType == 'h' ? shapes[n - 1].getHeight()
						: unitType == 'v' ? shapes[n - 1].calcVolume() : shapes[n - 1].calcBaseArea()));

		return shapes;
	}

	/**
	 * Sorts an array of shapes using the merge sort algorithm.
	 * 
	 * This method implements the merge sort algorithm to sort the shapes in
	 * descending order based on the specified property (height, volume, or base
	 * area).
	 * 
	 * @param shapes   The array of Shape objects to sort
	 * @param unitType The property to sort by (h=height, v=volume, a=base area)
	 * @return The array of Shape objects (currently unsorted)
	 */
	public static Shape[] mergeSort(Shape[] shapes, char unitType) {
		if (shapes == null || shapes.length <= 1) { // Base case: already sorted or empty
            return shapes;
        }

		Comparator<Shape> comparator = null; // Declare comparator

		// Set comparator based on args

		if (unitType == 'h') {
			comparator = Comparator.naturalOrder(); // natural order uses the Comparable written in shapes class
		} else if (unitType == 'v') {
			comparator = new VolumeComparator();
		} else if (unitType == 'a') {
			comparator = new BaseAreaComparator();
		}

		int n = shapes.length;
		int mid = n / 2;

		// Split array at the middle

		Shape[] left = Arrays.copyOfRange(shapes, 0, mid);
		Shape[] right = Arrays.copyOfRange(shapes, mid, n);

		left = mergeSort(left, unitType);
		right = mergeSort(right, unitType);

		Shape[] result = merge(left, right, comparator);

		return result;
	}

	private static Shape[] merge(Shape[] left, Shape[] right, Comparator<Shape> comparator) {
		int leftLen = left.length;
		int rightLen = right.length;
		Shape[] result = new Shape[leftLen + rightLen];

		int i = 0, j = 0, k = 0;

		while (i < leftLen && j < rightLen) {
			if (comparator.compare(left[i], right[j]) <= 0) {
				result[k++] = left[i++];
			} else {
				result[k++] = right[j++];
			}
		}

		while (i < leftLen) {
			result[k++] = left[i++];
		}

		while (j < rightLen) {
			result[k++] = right[j++];
		}

		return result;
	}

	/**
	 * Sorts an array of shapes using the quick sort algorithm.
	 * 
	 * This method implements the quick sort algorithm to sort the shapes in
	 * descending order based on the specified property (height, volume, or base
	 * area).
	 * 
	 * @param shapes   The array of Shape objects to sort
	 * @param unitType The property to sort by (h=height, v=volume, a=base area)
	 * @return The array of Shape objects (currently unsorted)
	 */
	public static Shape[] quickSort(Shape[] shapes, char unitType) {
		return shapes;
	}

	public static void printSortedShapes(Shape[] shapes, char unitType) {

		int n = shapes.length;

		System.out.printf("%-20s %-25s %-10.3f%n", "First element:", shapes[0].getClass().getSimpleName(),
				(unitType == 'h' ? shapes[0].getHeight()
						: unitType == 'v' ? shapes[0].calcVolume() : shapes[0].calcBaseArea()));

		for (int i = 999; i < n - 1; i += 1000) {
			System.out.printf("%-20s %-25s %-10.3f%n", (i + 1) + "-th element:", shapes[i].getClass().getSimpleName(),
					(unitType == 'h' ? shapes[i].getHeight()
							: unitType == 'v' ? shapes[i].calcVolume() : shapes[i].calcBaseArea()));
		}

		System.out.printf("%-20s %-25s %-10.3f%n", "Last element:", shapes[n - 1].getClass().getSimpleName(),
				(unitType == 'h' ? shapes[n - 1].getHeight()
						: unitType == 'v' ? shapes[n - 1].calcVolume() : shapes[n - 1].calcBaseArea()));
	}
}
