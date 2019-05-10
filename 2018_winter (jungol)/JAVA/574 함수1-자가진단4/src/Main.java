import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int heavyNum, num;
//		int a,b,c;
		Scanner scan = new Scanner(System.in);
//		a = scan.nextInt();
//		b = scan.nextInt();
//		c = scan.nextInt();
//		
//		System.out.println(greatest(greatest(a, b),c));
		num = scan.nextInt();
		heavyNum = num;
		num = scan.nextInt();
		heavyNum = greatest(heavyNum, num);
		num = scan.nextInt();
		heavyNum = greatest(heavyNum, num);

		System.out.println(heavyNum);
	}

	public static int greatest(int heavyNum, int num) {
		if (heavyNum < num) {
			heavyNum = num;
		}
		return heavyNum;
	}
}
