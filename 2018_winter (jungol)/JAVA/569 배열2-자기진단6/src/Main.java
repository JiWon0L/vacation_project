import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int score;
		int[][] array = new int[5][4];
		int sum = 0, avg = 0;
		int cnt = 0;

		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				score = scan.nextInt();
				array[i][j] = score;
				sum += array[i][j];
			}
			avg = sum / 4;
			if (avg >= 80) {
				System.out.println("pass");
				cnt++;
			} else {
				System.out.println("fail");
			}
			sum = 0;
		}
		System.out.println("Successful : " + cnt);
	}

}
