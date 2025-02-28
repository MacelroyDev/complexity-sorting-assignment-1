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
	public static Shape[] mergeSort(Shape[] shapes, char unitType, int n) {		
		if (n <= 1) { // Recursion check
			return null;
		}
		
		int mid = n / 2;
		// Create new arrays for each half
		Shape[] left = new Shape[mid];
		Shape[] right = new Shape[n-mid];
		
		// Split the arrays
		for (int i = 0; i < mid; i++) {
			left[i] = shapes[i];
		}
		
		for (int i = mid; i < n; i++) {
			right[i - mid] = shapes[i];
		}
		
		// Call recursive method for each array
		mergeSort(left,unitType,mid);
		mergeSort(right,unitType,n - mid);
		
		
		// Return a merged value of the final array
		return merge(shapes,left,right,mid,n - mid, unitType);
		
		
	}
	
	// Helper function for merge sort to re-merge the arrays
	public static Shape[] merge(Shape[] shapes,Shape[] l,Shape[] r,int left, int right,char unitType) {
		
		Comparator<Shape> comparator = null; // Declare comparator
		
		if (unitType == 'h') {
			comparator = Comparator.naturalOrder(); // natural order uses the Comparable written in shapes class
		} else if (unitType == 'v') {
			comparator = new VolumeComparator();
		} else if (unitType == 'a') {
			comparator = new BaseAreaComparator();
		}
		
		
		int i = 0, j = 0, k = 0;
	    while (i < left && j < right) {
	    	int comparison = 0;
	    	comparison = comparator.compare(l[i], r[j]);
	    	
	        if (comparison < 1) {
	        	shapes[k++] = l[i++];
	        }
	        else {
	        	shapes[k++] = r[j++];
	        }
	    }
	    while (i < left) {
	    	shapes[k++] = l[i++];
	    }
	    while (j < right) {
	    	shapes[k++] = r[j++];
	    }
		
		return shapes;
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

	
	
	/**
	 * Prints the first, last, and every 1000th element of the sorted array
	 * 
	 * This method prints the array of sorted shapes to the console according
	 * to the criteria listed above.
	 * 
	 * @param shapes   The array of sorted Shape objects to print
	 * @param unitType The property to print along side the name
	 * (h=height, v=volume, a=base area)
	 */
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
	
	/**
	 * Prints the entire sorted array
	 * 
	 * This method prints the entire array of sorted shapes for
	 * the purpose of debugging
	 * 
	 * @param shapes   The array of sorted Shape objects to print
	 * @param unitType The property to print along side the name
	 * (h=height, v=volume, a=base area)
	 */
	public static void printArrayDebug(Shape[] shapes, char unitType) {
		for (int i = 0; i < shapes.length; i++) {
            Shape shape = shapes[i];
            System.out.printf("Element %d: %s, ", i, shape.getClass().getSimpleName());

            if (unitType == 'h') {
                System.out.printf("Height: %.3f%n", shape.getHeight());
            } else if (unitType == 'v') {
                System.out.printf("Volume: %.3f%n", shape.calcVolume());
            } else if (unitType == 'a') {
                System.out.printf("Base Area: %.3f%n", shape.calcBaseArea());
            } else {
                System.out.println("Invalid unitType.");
            }
		}
	}
	
	
}
