package arrays;

public class PushZeroAtEnd {

	public static void printArray(int arr[])
	{
		for(int i = 0; i<arr.length; i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static void pushZeroAtEnd(int arr[])
	{
		 int n = arr.length;
	        int k = 0;
	        for(int  i = 0; i < n;)
	        {
	            if(arr[i] > 0 && arr[k] ==0)
	            {
	                int temp = arr[i];
	                arr[i] = arr[k];
	                arr[k] = temp;
	                k++;
	                i++;
	            }
	            else if(arr[i]==0 && arr[k] == 0)
	            {
	                i++;
	            }
	            else
	            {
	                i++;
	                k++;
	            }
	        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {2,3,0,5,0};
		pushZeroAtEnd(arr);
		printArray(arr);
	}

}
