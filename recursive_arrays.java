/** Displays integers in an array from first to last
@param array An array of integers
@param first The index of the first element displayed
@param last The index of the last element displayed */

public static void displayArray(int array[], int first, int last)
{
	System.out.print(array[first] + " ");
	if (first < last)
		displayArray(array, first + 1, last);
}

/**Displays integers in an array from last to first
*/
public static void displayArray(int array[], int first, int last)
{
  if (first <= last)
  {
    displayArray(array, first, last - 1);
    System.out.print (array[last] + " ");
  }
}

/** Displays bag objects, one per lne, from an array. */

public void display()
{
  displayArray(0, numberOfEntries - 1);
} // end display

public void displayArray(int first, int last)
{
  System.out.println(bag[first]);
  if (first < last)
    displayArray(first + 1, last);
}//end displayArray

