import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;

		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();

		System.out.println(sum(num));
	}

	public static int sum(int num) {
		int number = num;
		for (int i = 1; i < num; i++) {
			number += i;
		}
		return number;
	}
}
