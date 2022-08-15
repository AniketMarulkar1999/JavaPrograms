package arrays;

public class BasicsOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// When we declare array all its values are filled with default values of
		// datatypes.
		int arr[] = new int[10];
		arr[0] = 5;
		arr[5] = 17;
		
		System.out.println(arr[0]); //5
		System.out.println(arr[5]); //17
		System.out.println(arr[2]); //0, int has default value -> 0
		
		//System.out.println(arr[-1]); //IndexOutOfBoundsException, index starts from 0;
		//System.out.println(arr[10]); //IndexOutOfBoundsException
		
		char[] carray = new char[5]; // initializes with null -> nothing will be displayed
		double[] darray = new double[5]; // initializes with 0.0
		
		System.out.println(carray[2]); // null
		System.out.println(darray[2]); // 0.0
	}

}
