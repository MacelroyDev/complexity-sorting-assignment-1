package appDomain;

import shapes.*;

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

}
