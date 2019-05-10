import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		recurisve(n, 1);
	}
	public static void recurisve(int n, int m) {
		System.out.println("recursive");
		if(n == m) {
			return;
		}
		else {
			recurisve(n, m+1);
		}
	}
}
