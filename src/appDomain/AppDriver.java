package appDomain;

import shapes.*;
import utility.Algorithms;
import appDomain.parser.*;

public class AppDriver
{
	public static void main( String[] args )
	{
		// TODO Auto-generated method stub

		// refer to demo001 BasicFileIO.java for a simple example on how to
		// read data from a text file

		// refer to demo01 Test.java for an example on how to parse command
		// line arguments and benchmarking tests

		// refer to demo02 Student.java for comparable implementation, and
		// NameCompare.java or GradeCompare for comparator implementations

		// refer to demo02 KittySort.java on how to use a custom sorting
		// algorithm on a list of comparables to sort using either the
		// natural order (comparable) or other orders (comparators)
		
		ArgumentParser argParser = new ArgumentParser();
		
		if (argParser.parseArgs(args) != null)
		{
			char sortingAlgorithm = argParser.getSortingAlgorithm();
			char unitType = argParser.getUnitType();
			Shape[] shapes = argParser.generateArray();
			Shape[] sortedArr = null;
			
			System.out.println("Chosen sorting algorithm: " + sortingAlgorithm);
			System.out.println("Chosen unit to sort by: " + unitType);
			
			long startTime = System.currentTimeMillis();
			switch (sortingAlgorithm)
			{
				case 'b':
					sortedArr = Algorithms.bubbleSort(shapes, unitType);
					break;
					
				case 's':
					sortedArr = Algorithms.selectionSort(shapes, unitType);
					break;
					
				case 'i':
					sortedArr = Algorithms.insertionSort(shapes, unitType);
					break;
					
				case 'm':
					return;
					
				case 'q':
					return;
			}
			long endTime = System.currentTimeMillis();
			
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
