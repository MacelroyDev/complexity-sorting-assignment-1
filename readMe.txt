CPRG-304 - OOP3 - Assignment 1
Assignment 1: Complexity Sorting

This application implements a sorting system for 3D geometric shapes using multiple sorting algorithms.
The program sorts shapes based on their height, base area, or volume in descending order, and provides benchmarking data for algorithm performance comparison.

To run this program, ensure you have java 8 installed.
Then, in a CLI, run the command: "java -jar Sort.jar -f -t -s" (without quotations)

This program REQUIRES the use of 3 command-line argument flags.

1. -f / -F

File name. provide the absolute or relative path to the file name storing the info of
shapes that you wish to sort. Ensure the data inside the file is formatted as such so that
the first line contains the number of shapes' info provided, while each next line contains
the type of shape, side length, and height length. 
For example:
1 10
2 OctagonalPrism 25253.611 29464.463
3 Pyramid 34976.672 8556.669
4 TriangularPrism 12209.184 38774.693

2. -t / -T

What unit you would like to sort by.
Possible options include:
-tv | volume
-ta | base area
-th | height

3. -s / -S

Sorting algorithm. Allows you to select the sorting algorithm you would like to use.
Possible options include:
-sb | bubble sort
-ss | selection sort
-si | insertion sort
-sm | merge sort
-sq | quick sort
-sz | heap sort
