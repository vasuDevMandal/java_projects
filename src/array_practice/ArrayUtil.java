package array_practice;

import array_practice.ArrayUtil;

public class ArrayUtil {

	public void printArray(int[] arr) {
		int n = arr.length;
		for(int i = 0; i<n ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
	}
	
	public void Demo() {
		int[] myArray = new int[5];
		myArray[4] = 4;
		printArray(myArray);
		
		int[] arr2 = {1,5,6,7,8};
		printArray(arr2);
//		System.out.println(arr2);
	}
	
	public static void main(String args[]) {
		ArrayUtil arrUtil = new ArrayUtil();
		arrUtil.Demo();
	}
}
