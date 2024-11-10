package array_practice;

public class MoveZerosToEndOfArray {

	public static void printArray(int[] arr) {
		int n = arr.length;
		for(int i = 0; i<n ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static int[] moveZeros(int[] arr) {
		int n = arr.length;
		int j = 0;
		for(int i=0 ; i < n; i++) {
			if(arr[i] != 0 && arr[j] == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			if(arr[j] != 0) {
				j++;
			}
		}
		return arr;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {1,0,5,0,9,6,0,4,0};
		
		printArray(moveZeros(arr));
	}
}
