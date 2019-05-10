import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		int[] array = new int[100];
		int cnt = 0;

		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			num = scan.nextInt();
			if (num == -1) {
				cnt = i;
				break;
			}
			array[i] = num;
		}
		
		if (cnt < 3) {
			for (int i = 0; i < cnt; i++) {
				System.out.print(array[i] + " ");
			}
		}else {
			System.out.print(array[cnt - 3] + " " 
						+ array[cnt - 2] + " " 
						+ array[cnt - 1]);
		}
	}
}
