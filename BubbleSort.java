package arrays;

public class BubbleSort {

	public static void printArray(int arr[])
	{
		int n = arr.length;
		for(int i = 0; i<n; i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}
	//Don't refer this refer from Practice Question
	public static void bubbleSort(int arr[])
	{
		int n = arr.length;
        int i = 0, max = n;
        while( i < n-1)
        {
            int j = 0;
            while(j < max-1)
        	{
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                j++;
        	}
            i++;
            max--;
            
        }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//In binary search array should be sorted
		int arr[] = {3,4,1,5,6,2};
		bubbleSort(arr);
		printArray(arr);
	}

}
