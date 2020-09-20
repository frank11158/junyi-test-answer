import java.util.Scanner;
public class Q1 {
	// (A)
	public static String reverseA(String s) {
		char[] c = s.toCharArray();
		StringBuilder ans = new StringBuilder();
		for(int i = c.length-1; i >= 0; i--) {
			ans.append(c[i]);
		}
		return ans.toString();
	}
	// (B)
	public static String reserveB(String s) {
		StringBuilder ans = new StringBuilder();
		String[] strs = s.split(" ");
		for(int i = 0; i < strs.length; i++) {
			char[] c = strs[i].toCharArray();
			for(int j = c.length-1; j >= 0; j--) {
				ans.append(c[j]);
			}
			if(i < strs.length-1)
				ans.append(" ");
		}
		return ans.toString();
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 1. (A)
		System.out.println("Question 1-A");
		System.out.print("Enter a string: ");
		String str1 = input.nextLine();
		String strReversed = reverseA(str1);
		System.out.println("Output: " + strReversed);
		
		// 1. (B) Assume that the definition of a "Word" is spaced by " ".
		System.out.println("Question 1-B");
		System.out.print("Enter a string: ");
		String str2 = input.nextLine();
		strReversed = reserveB(str2);
		System.out.println("Output: " + strReversed);
	}
}
