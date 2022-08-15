package arrays;

public class SelectionSort {

	public static void printArray(int arr[])
	{
		int n = arr.length;
		for(int i = 0; i<n; i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static void selectionSort(int arr[])
	{
		int n = arr.length;
        
        for(int i =0; i<n; i++)
        {
            int min = arr[i];
            int minIndex = i;
            for(int j = i; j < n; j++)
            {
                if(arr[j] < min)
                {
                    min = arr[j];
                    minIndex = j;
                }
            }
            //Swap the elements
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//In binary search array should be sorted
		int arr[] = {3,4,1,5,6,2};
		selectionSort(arr);
		printArray(arr);
	}

}
