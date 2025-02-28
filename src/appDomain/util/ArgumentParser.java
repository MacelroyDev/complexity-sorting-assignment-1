package appDomain.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import shapes.Cone;
import shapes.Cylinder;
import shapes.OctagonalPrism;
import shapes.PentagonalPrism;
import shapes.Pyramid;
import shapes.Shape;
import shapes.SquarePrism;
import shapes.TriangularPrism;

/**
 * Processes command-line arguments and constructs an array of shapes from an input file.
 * 
 * This class is responsible for parsing command-line arguments to determine/validate:
 * 
 * 1. The input file name containing shape data
 * 2. The shape property to use for comparison (height, volume, or base area)
 * 3. The sorting algorithm to apply
 * 
 * It also reads the specified input file and constructs the appropriate shape objects.
 */
public class ArgumentParser
{

	 /** The path to the input file containing shape data */
	private String fileName;
	
	 /** The property to sort shapes by (v=volume, h=height, a=base area) */
	private char unitType;
	
	/** The sorting algorithm to use (b=bubble, s=selection, i=insertion, m=merge, q=quick, z=custom) */
	private char sortingAlgorithm;

	/**
     * Gets the parsed file name.
     * 
     * @return The name of the input file
     */
	public String getFileName()
	{
		return fileName;
	}

	/**
     * Sets the file name for the input data.
     * 
     * @param fileName The path to the input file
     */
	public void setFileName(String fileName)
	{
		this.fileName = fileName;
	}

	/**
     * Gets the unit type/property to sort shapes by.
     * 
     * @return The unit type character (v=volume, h=height, a=base area)
     */
	public char getUnitType()
	{
		return unitType;
	}

	/**
     * Sets the unit type/property to sort shapes by.
     * 
     * @param unitType The unit type character (v=volume, h=height, a=base area)
     */
	public void setUnitType(char unitType)
	{
		this.unitType = unitType;
	}

	/**
     * Gets the sorting algorithm to use.
     * 
     * @return The sorting algorithm character (b=bubble, s=selection, i=insertion, m=merge, q=quick, z=custom)
     */
	public char getSortingAlgorithm()
	{
		return sortingAlgorithm;
	}

	/**
     * Sets the sorting algorithm to use.
     * 
     * @param sortingAlgorithm The sorting algorithm character (b=bubble, s=selection, i=insertion, m=merge, q=quick, z=custom)
     */
	public void setSortingAlgorithm(char sortingAlgorithm)
	{
		this.sortingAlgorithm = sortingAlgorithm;
	}

	// Parse Arguments ----------------------------
	/**
     * Parses the command-line arguments to extract the file name, unit type, and sorting algorithm.
     * 
     * Expected format for arguments:
     * 
     * -f[fileName]: The input file name
     * -t[unitType]: The property to sort by (v=volume, h=height, a=base area)
     * -s[algorithm]: The sorting algorithm (b=bubble, s=selection, i=insertion, m=merge, q=quick, z=custom)
     * 
     * @param args The command-line arguments to parse
     * @return The selected sorting algorithm character if parsing was successful, null otherwise
     */
	public Character parseArgs(String[] args)
	{
		for (String arg : args)
		{
			if (!arg.startsWith("-") || arg.length() < 3)
			{
				return null;
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
						return null;
					}

					char type = Character.toLowerCase(arg.charAt(2));

					if (type == 'v' || type == 'h' || type == 'a')
					{
						setUnitType(type);
					}
					else
					{
						System.out.println("Incorrect '-t' flag argument");
						return null;
					}
					break;

				case 's':
					if (arg.length() != 3)
					{
						System.out.println("Incorrect '-s' flag argument");
						return null;
					}

					char algorithm = Character.toLowerCase(arg.charAt(2));

					if (algorithm == 'b' || algorithm == 's' || algorithm == 'i' || algorithm == 'm' || algorithm == 'q'
							|| algorithm == 'z')
					{
						setSortingAlgorithm(algorithm);
					}
					else
					{
						System.out.println("Incorrect '-s' flag argument");
						return null;
					}
					break;

				default:
					System.out.println("Incorrect flag(s)");
					return null;
			}
		}

		if (fileName != null && unitType != 0 && sortingAlgorithm != 0)
		{
			return (sortingAlgorithm);
		}
		else
		{
			return null;
		}

	}

	// Generate Array ---------------------------------------
	/**
     * Generates an array of Shape objects from the input file.
     * 
     * Reads the specified input file and constructs the appropriate shape objects
     * based on the shape type and dimensions specified in the file.
     * The file format is expected to be:
     * 
     * n (number of shapes)
     * ShapeType1 side1 height1
     * ShapeType2 side2 height2
     * ...
     * 
     * Where ShapeType can be: Cone, Cylinder, OctagonalPrism, PentagonalPrism,
     * Pyramid, SquarePrism, or TriangularPrism.
     * 
     * @return An array of Shape objects created from the input file data
     */
	public Shape[] generateArray()
	{
		File inputFile = new File(getFileName());
		Scanner input = null;

		int numOfShapes = 0;

		try
		{
			input = new Scanner(inputFile);
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}

		if (input.hasNext())
		{
			numOfShapes = input.nextInt();
		}

		Shape[] shapes = new Shape[numOfShapes];
		int arrIndex = 0;

		while (input.hasNext())
		{
			String shapeType = input.next();

			if (input.hasNext())
			{
				double shapeSide = Double.parseDouble(input.next());

				if (input.hasNext())
				{
					double shapeHeight = Double.parseDouble(input.next());

					switch (shapeType)
					{
						case "Cone":
							Cone newCone = new Cone(shapeSide, shapeHeight);
							shapes[arrIndex++] = newCone;
							break;

						case "Cylinder":
							Cylinder newCylinder = new Cylinder(shapeSide, shapeHeight);
							shapes[arrIndex++] = newCylinder;
							break;

						case "OctagonalPrism":
							OctagonalPrism newOctagonalPrism = new OctagonalPrism(shapeSide, shapeHeight);
							shapes[arrIndex++] = newOctagonalPrism;
							break;

						case "PentagonalPrism":
							PentagonalPrism newPentagonalPrism = new PentagonalPrism(shapeSide, shapeHeight);
							shapes[arrIndex++] = newPentagonalPrism;
							break;

						case "Pyramid":
							Pyramid newPyramid = new Pyramid(shapeSide, shapeHeight);
							shapes[arrIndex++] = newPyramid;
							break;

						case "SquarePrism":
							SquarePrism newSquarePrism = new SquarePrism(shapeSide, shapeHeight);
							shapes[arrIndex++] = newSquarePrism;
							break;

						case "TriangularPrism":
							TriangularPrism newTriangularPrism = new TriangularPrism(shapeSide, shapeHeight);
							shapes[arrIndex++] = newTriangularPrism;
							break;

						default:
							break;
					}
				}
			}
		}
		return shapes;
	}
}
