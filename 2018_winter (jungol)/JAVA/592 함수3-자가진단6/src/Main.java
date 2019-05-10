import java.util.Scanner;

public class Main {
	static int n, k;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			n = scan.nextInt();
			funtion(n);
		}
		System.out.println(k);
	}

	public static int funtion(int n) {
		k += (int) Math.pow(n, 2);
		return k;
	}
}
