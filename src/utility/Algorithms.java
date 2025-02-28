package utility;

import shapes.*;

public class Algorithms
{
	public static Shape[] bubbleSort(Shape[] shapes, char unitType)
	{
		int n = shapes.length;
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
		}
		return shapes;
	}

	public static Shape[] insertionSort(Shape[] shapes, char unitType)
	{
		int n = shapes.length;
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
			else if (unitType == 'a')
			{
				while (j >= 0 && shapes[j].calcBaseArea() < index.calcBaseArea())
				{
					shapes[j + 1] = shapes[j];
					j = j - 1;
				}
			}

			shapes[j + 1] = index;
		}
		return shapes;
	}
}
