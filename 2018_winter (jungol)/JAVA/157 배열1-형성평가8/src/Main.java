import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		int[] array = new int[100];
		int cnt = 0, cnt1 = 0;
		int sum = 0;
		double avg = 0.0;

		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			num = scan.nextInt();
			if (num == 0) {
				break;
			}
			array[i] = num;
			cnt++;
		}
		
		for (int i = 0; i < cnt; i++) {
			if (array[i] % 5 == 0) {
				cnt1++;
				sum += array[i];
			}
		}
		avg = (double)sum / cnt1;

		System.out.printf("Multiples of 5 : " + cnt1 + "\nsum : " + sum + "\navg : " + "%.1f", avg);
	}
}

//import java.util.Scanner;
//
//public class Main {
//
//	public static void main(String[] args) {
//		int num;
//		int[] array = new int[100];
//		int cnt = 0;
//		int sum = 0;
//		double avg = 0.0;
//
//		Scanner scan = new Scanner(System.in);
//		for (int i = 0; i < array.length; i++) {
//			num = scan.nextInt();
//			if (num == 0) {
//				break;
//			}
//			array[i] = num;
//			if (array[i] % 5 == 0) {
//				sum += array[i];
//				cnt++;
//			}
//		}
//		avg = sum / cnt;
//
//		System.out.printf("Multiples of 5 : " + cnt + "\nsum : " + sum + "\navg : " + "%.1f", avg);
//	}
//}
