import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		int[] array = new int[100];
		int cnt = 0;
		
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < array.length; i++) {
			num = scan.nextInt();
			if(num == 0) {
				break;
			}
			array[i] = num;
			cnt++;
		}
		System.out.println(cnt);
		
		for(int i = 0 ; i < cnt; i++) {
			if(array[i] % 2 == 0) {
				array[i] = array[i] / 2;
			}
			else if(array[i] % 2 == 1) {
				array[i] = array[i] * 2;
			}
		}
		
		for(int i = 0; i < cnt; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
