import java.util.Scanner;

public class Main {
	static int num;

	public static void main(String[] args) {
		int n1, n2;

		Scanner scan = new Scanner(System.in);
		n1 = scan.nextInt();
		num = n1;
		n2 = scan.nextInt();
		
		if(n2 == 0) {
			n1 = 1;
		}
		for (int i = 0; i < n2 - 1; i++) {
			n1 = power(n1);
		}
		System.out.println(n1);
	}

	public static int power(int n1) {
		n1 = n1 * num;
		return n1;
	}
}
