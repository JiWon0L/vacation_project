import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n1, n2;
		int temp;
		
		Scanner scan = new Scanner(System.in);
		n1 = scan.nextInt();
		n2 = scan.nextInt();
		
		if(n1 > n2) {
			temp = n2;
			n2 = n1;
			n1 = temp;
		}
		for (int i = n1; i <= n2; i++) {
			timeTable(n1);
			n1++;
		}
	}

	public static void timeTable(int n1) {
		System.out.println("== " + n1 + "dan ==");
		for (int i = 1; i < 10; i++) {
			System.out.printf(n1 + " * " + i + " = " + "%2d", (n1 * i));
			System.out.println();
		}
		System.out.println();
	}
}
