 
/** 
Binary Search Template (Already Sorted)
*/

public static int binarySearch(int[] a, int key)
{
	int start = 0, end = a.length - 1;
	while (start + 1 < end)
	{
		int mid = start + (end - start) / 2;
		if (key < a[mid]) end = mid;
		else if (key > a[mid]) start = mid;
		else return mid;
	}
	return -1;
}
