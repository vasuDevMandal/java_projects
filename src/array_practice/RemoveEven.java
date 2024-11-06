package array_practice;

public class RemoveEven {
	
	public static void printArray(int[] arr) {
		int n = arr.length;
		for(int i = 0; i<n ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static int[] removeEvenIntegers(int[] arr) {
		int oddCounter = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]%2 != 0) {
				oddCounter++;
			}
		}
		
		int[] oddArray = new int[oddCounter] ;
		int index = 0;
		for(int i = 0; i< arr.length; i++) {
			if(arr[i]%2 != 0) {
				oddArray[index] = arr[i];
				index++;
			}
		}
		return oddArray;
	}
	
	public static void main(String[] args) {
		int[] arr = {3,2,4,7,10,6,5};
		printArray(arr);
		printArray(removeEvenIntegers(arr));
	}
}
