import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double num;
		double[] array = new double[6];
		double average = 0.0;

		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			num = scan.nextDouble();
			array[i] = num;
		}

		for (int i = 0; i < array.length; i++) {
			average += array[i];
		}
		average = average / 6;
		System.out.printf("%.1f", average);
	}
}
