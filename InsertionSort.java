package arrays;

public class InsertionSort {

	public static void printArray(int arr[])
	{
		int n = arr.length;
		for(int i = 0; i<n; i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}
	//Don't refer this code, refer from Practice Question
	public static void insertionSort(int arr[])
	{
		int n = arr.length;
        for(int  i = 0; i < n; i++)
        {
            for(int j = i; j > 0; j--)
            {
                if(arr[j] < arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else if(arr[j] > arr[j-1])
                {
                    continue;
                }
            }
        }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//In binary search array should be sorted
		int arr[] = {3,4,1,5,6,2};
		insertionSort(arr);
		printArray(arr);
	}

}
