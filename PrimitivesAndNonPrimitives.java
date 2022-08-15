package arrays;

public class PrimitivesAndNonPrimitives {

	public static void increment(int i)
	{
		i++;
	}
	
	public static void incrementArray(int input[])
	{
		System.out.println(input); // It will same as line 36;
		for(int i = 0; i<input.length; i++)
		{
			input[i] = input[i]+1;
		}
	}
	
	public static void printArray(int arr[])
	{
		for(int i = 0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;
		increment(i);
		System.out.println(i); //10
		
		int arr[] = {1,2,3,4,5};
		incrementArray(arr);
		System.out.println(arr); // It will same as line 12;
		printArray(arr); //2 3 4 5 6
		
	}

}
