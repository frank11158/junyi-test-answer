import java.util.Scanner;
public class Q2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input: ");
		int target = input.nextInt();
		int ans = 0;
		for(int i = 1; i <= target; i++) {
			if(i%15 == 0) ans++;
			else if(i%3 == 0) continue;
			else if(i%5 == 0) continue;
			else ans++;
		}
		System.out.println("Output: " + ans);
	}
}