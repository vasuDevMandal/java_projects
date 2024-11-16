package array_practice;

public class findMissingNumInArray {

	public static void printArray(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n; i++ ) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
//	1st approach
//	public static int findMissingNum(int[] arr) {
//		int n = arr.length + 1;
//		//formula for sum of first n natural nums: n(n+1)/2
//		int formulaSum = n*(n+1)/2;
//		int arrSum = 0;
//		for(int i = 0; i<n-1 ; i++) {
////			System.out.println(arrSum + arr[i] );
//			arrSum += arr[i];
//		}
//		int num = formulaSum - arrSum;
//		return num;
//		
//		
//	}
	
	public static int findMissingNum(int[] arr) {
		int n = arr.length + 1;
		int formulaSum = n*(n+1)/2;
		
		for(int i = 0; i<n-1 ; i++) {
			formulaSum = formulaSum - arr[i];
		}
		return formulaSum;
		
		
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,5,4};
		
		printArray(arr);
		System.out.println("missign num: "+findMissingNum(arr));
		
 	}
}
