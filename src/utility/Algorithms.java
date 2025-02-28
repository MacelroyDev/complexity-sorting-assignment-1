package utility;

import shapes.*;

public class Algorithms
{
	public static Shape[] bubbleSort(Shape[] shapes, char unitType)
	{
		int n = shapes.length;
		int sortedCount = 1;

		System.out.println("First element is: " + shapes[0].getClass() + (unitType == 'h'
				? " Height: " + shapes[0].getHeight()
				: unitType == 'v' ? " Volume: " + shapes[0].calcVolume() : " Area: " + shapes[0].calcBaseArea()));

		for (int i = 0; i < n - 1; i++)
		{
			for (int x = 0; x < n - i - 1; x++)
			{
				if (unitType == 'h')
				{
					if (shapes[x].getHeight() < shapes[x + 1].getHeight())
					{
						Shape temp = shapes[x];
						shapes[x] = shapes[x + 1];
						shapes[x + 1] = temp;
					}
				}
				else if (unitType == 'v')
				{
					if (shapes[x].calcVolume() < shapes[x + 1].calcVolume())
					{
						Shape temp = shapes[x];
						shapes[x] = shapes[x + 1];
						shapes[x + 1] = temp;
					}
				}
				else if (unitType == 'a')
				{
					if (shapes[x].calcBaseArea() < shapes[x + 1].calcBaseArea())
					{
						Shape temp = shapes[x];
						shapes[x] = shapes[x + 1];
						shapes[x + 1] = temp;
					}
				}
			}
			sortedCount++;
			if (sortedCount % 1000 == 0)
			{
				System.out.println(sortedCount + "-th element: " + shapes[n - i - 1].getClass()
						+ (unitType == 'h' ? " Height: " + shapes[n - i - 1].getHeight()
								: unitType == 'v' ? " Volume: " + shapes[n - i - 1].calcVolume()
										: " Area: " + shapes[n - i - 1].calcBaseArea()));
			}

		}
		System.out.println("Last element is: " + shapes[n - 1].getClass()
				+ (unitType == 'h' ? " Height: " + shapes[n - 1].getHeight()
						: unitType == 'v' ? " Volume: " + shapes[n - 1].calcVolume()
								: " Area: " + shapes[n - 1].calcBaseArea()));

		return shapes;
	}

	public static Shape[] insertionSort(Shape[] shapes, char unitType)
	{
		int n = shapes.length;
		int sortedCount = 1;

		System.out.println("First element is: " + shapes[0].getClass() + (unitType == 'h'
				? " Height: " + shapes[0].getHeight()
				: unitType == 'v' ? " Volume: " + shapes[0].calcVolume() : " Area: " + shapes[0].calcBaseArea()));

		for (int i = 1; i < n; i++)
		{
			Shape index = shapes[i];
			int j = i - 1;

			if (unitType == 'h')
			{
				while (j >= 0 && shapes[j].getHeight() < index.getHeight())
				{
					shapes[j + 1] = shapes[j];
					j = j - 1;
				}
			}
			else if (unitType == 'v')
			{
				while (j >= 0 && shapes[j].calcVolume() < index.calcVolume())
				{
					shapes[j + 1] = shapes[j];
					j = j - 1;
				}
			}
			else
			{
				while (j >= 0 && shapes[j].calcBaseArea() < index.calcBaseArea())
				{
					shapes[j + 1] = shapes[j];
					j = j - 1;
				}
			}

			shapes[j + 1] = index;
			sortedCount++;
			if (sortedCount % 1000 == 0)
			{
				System.out.println(sortedCount + "-th element: " + shapes[i].getClass()
						+ (unitType == 'h' ? " Height: " + shapes[i].getHeight()
								: unitType == 'v' ? " Volume: " + shapes[i].calcVolume()
										: " Area: " + shapes[i].calcBaseArea()));
			}
		}

		System.out.println("Last element is: " + shapes[n - 1].getClass()
				+ (unitType == 'h' ? " Height: " + shapes[n - 1].getHeight()
						: unitType == 'v' ? " Volume: " + shapes[n - 1].calcVolume()
								: " Area: " + shapes[n - 1].calcBaseArea()));

		return shapes;
	}

	public static Shape[] selectionSort(Shape[] shapes, char unitType)
	{
		int n = shapes.length;
		int sortedCount = 1;

		System.out.println("First element is: " + shapes[0].getClass() + (unitType == 'h'
				? " Height: " + shapes[0].getHeight()
				: unitType == 'v' ? " Volume: " + shapes[0].calcVolume() : " Area: " + shapes[0].calcBaseArea()));

		for (int i = 0; i < n - 1; i++)
		{
			int maxIndex = i;

			for (int j = i + 1; j < n; j++)
			{
				if (unitType == 'h')
				{
					if (shapes[j].getHeight() > shapes[maxIndex].getHeight())
					{
						maxIndex = j;
					}
				}
				else if (unitType == 'v')
				{
					if (shapes[j].calcVolume() > shapes[maxIndex].calcVolume())
					{
						maxIndex = j;
					}
				}
				else
				{
					if (shapes[j].calcBaseArea() > shapes[maxIndex].calcBaseArea())
					{
						maxIndex = j;
					}
				}
			}

			Shape temp = shapes[i];
			shapes[i] = shapes[maxIndex];
			shapes[maxIndex] = temp;

			sortedCount++;
			if (sortedCount % 1000 == 0)
			{
				System.out.println(sortedCount + "-th element: " + shapes[i].getClass()
						+ (unitType == 'h' ? " Height: " + shapes[i].getHeight()
								: unitType == 'v' ? " Volume: " + shapes[i].calcVolume()
										: " Area: " + shapes[i].calcBaseArea()));
			}
		}

		System.out.println("Last element is: " + shapes[n - 1].getClass()
				+ (unitType == 'h' ? " Height: " + shapes[n - 1].getHeight()
						: unitType == 'v' ? " Volume: " + shapes[n - 1].calcVolume()
								: " Area: " + shapes[n - 1].calcBaseArea()));

		return shapes;
	}

}
