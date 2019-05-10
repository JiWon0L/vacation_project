import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		int[] array = new int[10];
		int sum = 0;
		double avg = 0.0;

		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			num = scan.nextInt();
			array[i] = num;
		}

		for (int i = 1; i < 10; i += 2) {
			sum += array[i];
		}
		for (int i = 0; i < 10; i += 2) {
			avg += array[i];
		}
		avg /= 5;
		System.out.printf("sum : " + sum + "\navg : " +"%.1f",avg);
	}
}
