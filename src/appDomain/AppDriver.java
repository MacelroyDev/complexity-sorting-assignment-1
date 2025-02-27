package appDomain;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import shapes.*;

public class AppDriver
{
	// CLI argument variables
	private static String fileName;
	private static char unitType;
	private static char sortingAlgorithm;
	
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
		
		AppDriver argParser = new AppDriver();
		if (argParser.parseArgs(args))
		{
			
		} 
		else
		{
			System.out.println("Please enter the following command line arguments:");
			System.out.println("Example: java -jar Sort.jar -ffile_name -tv -sb");
			System.out.println("-f or -F followed by file_name (the file name and path) with no spaces");
			System.out.println("-t or -T followed by v (volume), h (height) or a (base area) with no spaces");
			System.out.println("-s or -S followed by b (bubble), s (selection), i (insertion), m (merge), q "
					+ "(quick) or z (your choice of sorting algorithm) with no spaces");
		}
		
		// Example objects for testing toString() and calculation methods
		Cylinder newCylinder = new Cylinder(19,40);
		Cone newCone = new Cone(22,17);
		Pyramid newPyramid = new Pyramid(38,29);
		
		
		SquarePrism newSquarePrism = new SquarePrism(18,19);
		TriangularPrism newTriangularPrism = new TriangularPrism(18,19);
		PentagonalPrism newPentagonalPrism = new PentagonalPrism(18,19);
		OctagonalPrism newOctagonalPrism = new OctagonalPrism(18,19);
		
		
		// Print objects to console for debugging
		System.out.println(newCylinder.toString());
		System.out.println(newCone.toString());
		System.out.println(newPyramid.toString());
		
		System.out.println(newSquarePrism.toString());
		System.out.println(newTriangularPrism.toString());
		System.out.println(newPentagonalPrism.toString());
		System.out.println(newOctagonalPrism.toString());

	}
	
	private boolean parseArgs( String[] args )
	{     
        for (String arg : args) 
        {
            if (!arg.startsWith("-") || arg.length() < 3) 
            {
                return false;
            }
            
            char flag = Character.toLowerCase(arg.charAt(1));
            
            switch (flag) 
            {
                case 'f':
                    fileName = arg.substring(2);
                    break;
                    
                case 't':
                    if (arg.length() != 3) 
                    {
                    	System.out.println("Incorrect '-t' flag argument");
                    	return false;
                    }
                    
                    char type = Character.toLowerCase(arg.charAt(2));
                    
                    if (type == 'v' || type == 'h' || type == 'a') 
                    {
                    	unitType = type;
                    } 
                    else 
                    {
                    	System.out.println("Incorrect '-t' flag argument");
                        return false;
                    }
                    break;
                    
                case 's':
                	if (arg.length() != 3) 
                    {
                    	System.out.println("Incorrect '-s' flag argument");
                    	return false;
                    }
                    
                    char algorithm = Character.toLowerCase(arg.charAt(2));
                    
                    if (algorithm == 'b' || algorithm == 's' || algorithm == 'i' || algorithm == 'm' || algorithm == 'q' || algorithm == 'z') 
                    {
                    	sortingAlgorithm = algorithm;
                    } 
                    else 
                    {
                    	System.out.println("Incorrect '-s' flag argument");
                        return false;
                    }
                    break;
                    
                default:
                	System.out.println("Incorrect flag(s)");
                    return false;
            }
        }
        
        return (fileName != null && unitType != 0 && sortingAlgorithm != 0);
	}

}
