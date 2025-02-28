package appDomain;

import appDomain.util.Utility;
import appDomain.util.ArgumentParser;
import shapes.Shape;

/**
 * The main driver class for the shape sorting application.
 * 
 * This class contains the main method that processes command-line arguments,
 * initializes the application components, and executes the selected sorting algorithm
 * on the shape data.
 * 
 */
public class AppDriver
{
	/**
     * The application entry point.
     * 
     * Parses command-line arguments, loads shape data from the specified file,
     * and sorts the shapes using the selected algorithm and comparison property.
     * The sorting performance is measured and reported in milliseconds.
     * 
     * @param args  Command-line arguments in the format:
     *             
     * -f[fileName]: The input file name containing shape data, either relative or absolute
     * -t[unitType]: The property to sort by (v=volume, h=height, a=base area)
     * -s[algorithm]: The sorting algorithm to use (b=bubble, s=selection, 
     *  			  i=insertion, m=merge, q=quick, z=custom)
     */
	public static void main( String[] args )
	{		
		ArgumentParser argParser = new ArgumentParser();
		
		if (argParser.parseArgs(args) != null)
		{
			char sortingAlgorithm = argParser.getSortingAlgorithm();
			char unitType = argParser.getUnitType();
			Shape[] shapes = argParser.generateArray();
			Shape[] sortedArr = null;
			
			System.out.println("Chosen sorting algorithm: " + sortingAlgorithm);
			System.out.println("Chosen unit to sort by: " + unitType + "\n");
			
			long startTime = System.currentTimeMillis();
			switch (sortingAlgorithm)
			{
				case 'b':
					sortedArr = Utility.bubbleSort(shapes, unitType);
					break;
					
				case 's':
					sortedArr = Utility.selectionSort(shapes, unitType);
					break;
					
				case 'i':
					sortedArr = Utility.insertionSort(shapes, unitType);
					break;
					
				case 'm':
					sortedArr = Utility.mergeSort(shapes, unitType);
					
				case 'q':
					sortedArr = Utility.quickSort(shapes, unitType);
					break;
				case 'z':
					break;
			}
			long endTime = System.currentTimeMillis();
			
			
			Utility.printSortedShapes(sortedArr, unitType);
			System.out.println("\nSorting completed in: " + (endTime - startTime) + "ms");
		} 
		else
		{
			// Error message when argument(s) is incorrect
			System.out.println("Please enter the following command line arguments:");
			System.out.println("Example: java -jar Sort.jar -ffile_name -tv -sb");
			System.out.println("-f or -F followed by file_name (the file name and path) with no spaces");
			System.out.println("-t or -T followed by v (volume), h (height) or a (base area) with no spaces");
			System.out.println("-s or -S followed by b (bubble), s (selection), i (insertion), m (merge), q "
					+ "(quick) or z (your choice of sorting algorithm) with no spaces");
		}
	}
}
