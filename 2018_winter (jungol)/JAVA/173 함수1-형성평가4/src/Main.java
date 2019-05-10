import java.util.Scanner;

public class Main {
	static int result;

	public static void main(String[] args) {
		int n1, n2;
		int temp;

		Scanner scan = new Scanner(System.in);
		n1 = scan.nextInt();
		n2 = scan.nextInt();
		if (n1 > n2) {
			temp = n2;
			n2 = n1;
			n1 = temp;
		}
		System.out.println(calculate(n1, n2));
	}

	public static int calculate(int n1, int n2) {
		result = (n2 * n2) - (n1 * n1);
		return result;
	}
}
