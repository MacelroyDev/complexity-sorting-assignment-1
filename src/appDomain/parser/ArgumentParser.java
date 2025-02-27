package appDomain.parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import shapes.*;

public class ArgumentParser {

	private String fileName;
	private char unitType;
	private char sortingAlgorithm;

	public Character parseArgs(String[] args) {
		for (String arg : args) {
			if (!arg.startsWith("-") || arg.length() < 3) {
				return null;
			}

			char flag = Character.toLowerCase(arg.charAt(1));

			switch (flag) {
			case 'f':
				fileName = arg.substring(2);
				break;

			case 't':
				if (arg.length() != 3) {
					System.out.println("Incorrect '-t' flag argument");
					return null;
				}

				char type = Character.toLowerCase(arg.charAt(2));

				if (type == 'v' || type == 'h' || type == 'a') {
					unitType = type;
				} else {
					System.out.println("Incorrect '-t' flag argument");
					return null;
				}
				break;

			case 's':
				if (arg.length() != 3) {
					System.out.println("Incorrect '-s' flag argument");
					return null;
				}

				char algorithm = Character.toLowerCase(arg.charAt(2));

				if (algorithm == 'b' || algorithm == 's' || algorithm == 'i' || algorithm == 'm' || algorithm == 'q'
						|| algorithm == 'z') {
					sortingAlgorithm = algorithm;
				} else {
					System.out.println("Incorrect '-s' flag argument");
					return null;
				}
				break;

			default:
				System.out.println("Incorrect flag(s)");
				return null;
			}
		}

		if (fileName != null && unitType != 0 && sortingAlgorithm != 0) {
			return (sortingAlgorithm);
		} else {
			return null;
		}

	}

	public Shape[] generateArray() {
		File inputFile = new File(fileName);
		Scanner input = null;

		int numOfShapes = 0;

		try {
			input = new Scanner(inputFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		if (input.hasNext()) {
			numOfShapes = input.nextInt();
		}

		Shape[] shapes = new Shape[numOfShapes];
		int arrIndex = 0;

		while (input.hasNext()) {
			String shapeType = input.next();

			if (input.hasNext()) {
				double shapeSide = Double.parseDouble(input.next());

				if (input.hasNext()) {
					double shapeHeight = Double.parseDouble(input.next());

					switch (shapeType) {
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
