package array_practice;

public class CheckPalindrome {

	public static void printArray(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n; i++ ) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
//	static boolean isPalindromeFn(String str) {
//		
//		boolean isPalindrome = false;
//		
//		int lastPointer = str.length();
//		int frontPointer = str.charAt(0);
//		
//		for(int i = 0; i < str.length(); i++) {
//			
//			if(frontPointer == lastPointer) {
//				isPalindrome = true;
//				
//			}else {
//				isPalindrome = false;
//				break;
//			}
//			lastPointer = str.charAt(str.length()-i);
//			frontPointer = str.charAt(i);
//			System.out.println("front -> "+frontPointer);
//			System.out.println("last -> "+lastPointer);
//		}
//		
//		
//		return isPalindrome;
//		
//	}
	
	static boolean isPalindromeFn(String str) {
		
		char[] ch = str.toCharArray();
		
		 int start = 0;
		 int end = ch.length - 1;
		 
		 while(start < end) {
			 if(ch[start] != ch[end]) {
				 return false;
			 }
			 start++;
			 end--;
		 }
		 return true;
	}
	
	public static void main(String[] args) {
		String str1 = "rar";
		String str2 = "fdgfdf";
		
		System.out.println(isPalindromeFn(str1));
		
	}
}
