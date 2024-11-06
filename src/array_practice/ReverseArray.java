package array_practice;

public class ReverseArray {
	
	public static void printArray(int[] arr) {
		int n = arr.length;
		for(int i = 0; i<n ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static int[] reverseArray(int[] arr) {
		int[] reverseArray = new int[arr.length];
		
		for(int i = 0; i <arr.length; i++) {
			reverseArray[i] = arr[arr.length - i - 1];
		}
		
		return reverseArray;
	}
	
	public static int[] reverseArray2(int[] arr, int start, int end) {
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		printArray(arr);
		System.out.println();
		printArray(reverseArray(arr));
		printArray(reverseArray2(arr, 0, arr.length-1));
	}
}
