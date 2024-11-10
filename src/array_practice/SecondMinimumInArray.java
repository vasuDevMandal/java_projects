package array_practice;

public class SecondMinimumInArray {
	
	public static void printArray(int[] arr) {
		int n = arr.length;
		for(int i = 0; i<n ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static int findSecondMax(int[] arr) {
		
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		for(int i = 0; i< arr.length; i++) {
			if(arr[i]>max) {
				secondMax = max;
				max = arr[i];
				
			}if( arr[i] > secondMax && arr[i] != max){
				secondMax = arr[i];
		
			}
		}
		
		return secondMax;
	}

	public static void main(String[] args) {
		int[] arr = {12,45,65,78,12,4,6,65,78};
		printArray(arr);
		System.out.println(findSecondMax(arr));
		
	}
	
	
	
	
}
