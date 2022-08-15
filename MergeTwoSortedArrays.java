package arrays;

public class MergeTwoSortedArrays {

	public static void printArray(int arr[])
	{
		int n = arr.length;
		for(int i = 0; i<n; i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static int[] mergeSortedArrays(int arr1[], int arr2[])
	{
		int m = arr1.length;
        int n = arr2.length;
        int mn = m+n;
        int i = 0, j = 0, k =0;
        int arr3[] = new int[mn];
        
           while(i < m && j < n)
           {
               if(arr1[i] < arr2[j])
               {
                   arr3[k] = arr1[i];
                   i++;
                   k++;
               }
               else if(arr1[i] > arr2[j])
               {
                   arr3[k] = arr2[j];
                   j++;
                   k++;
               }
           }
           if(i < m)
           {
        	   while(i < m)
        	   {
        		   arr3[k] = arr1[i];
        		   i++;
        		   k++;
        	   }
           }
           else if(j < n)
           {
        	   while(j < n)
        	   {
        		   arr3[k] = arr2[j];
        		   j++;
        		   k++;
        	   }
           }
        
        return arr3;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//In binary search array should be sorted
		int arr1[] = {1,3,5,7,8,10,15};
		int arr2[] = {2,4,6,9,12};
		int arr3[] = mergeSortedArrays(arr1, arr2);
		printArray(arr3);
	}

}
