/** Displays the integers in an array
@param array An array of integers
@param first The index of the first element displayed
@param last The index of the last element displayed */

public static void displayArray(int array[], int first, int last)
{
	System.out.print(array[first] + " ");
	if (first < last)
		displayArray(array, first + 1, last);
}

