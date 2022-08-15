package arrays;

public class Sort012 {

	public static void sort012(int arr[])
	{
		int n = arr.length;
		int j = 0, k = n-1;
        for(int i = 0; i < k;)
        {
            if(arr[i] == 2 && arr[k]!=2)
            {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                --k;
            }
            if(arr[j] != 0 && arr[i] == 0)
            {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
                i++;
            }
            if(arr[k] == 2)
            {
                --k;
            }
            if(arr[i]==0 && arr[j]==0 && i==j)
            {
            	i++;
            	j++;
            }
            else
            {
            	i++;
            }
            printArray(arr);
            System.out.println("i="+i+"j="+j+"k="+k);
        }
	}
	
	public static void printArray(int arr[])
	{
		for(int i = 0;i <arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {2,2,1,1,2,1,0,0,1,2,2};
		sort012(arr);
		System.out.println();
		printArray(arr);
	}

}
