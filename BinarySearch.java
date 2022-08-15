package arrays;

public class BinarySearch {

	public static int binarySearch(int arr[], int x)
	{
		 int n = arr.length;
	        int start = 0, end = n-1;
	        
	        if(n==0)
	            return -1;
	        
	        while(start <= end)
	        {
	            int mid = (start+end)/2;
	            if(x > arr[mid])
	            {
	                start = mid + 1;
	            }
	            else if(x < arr[mid])
	            {
	                end = mid - 1;
	            }
	            else{
	                return mid;
	            }
	        }
	        return -1;
	        
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//In binary search array should be sorted
		int arr[] = {1,2,3,4,5,6};
		int n = 3;
		int index = binarySearch(arr, n);
		System.out.println(index);
	}

}
