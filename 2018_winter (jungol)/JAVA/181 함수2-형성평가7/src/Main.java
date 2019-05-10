import java.util.Scanner;

public class Main {
	static double r;
	static double area;

	public static void main(String[] args) {
		input();
		solve();
		output();
	}

	public static void input() {
		System.out.print("radius : ");
		Scanner scan = new Scanner(System.in);
		r = scan.nextDouble();
	}

	public static void solve() {
		area = r * r * 3.141592;
	}

	public static void output() {
		System.out.printf("area = " + "%.3f", area);
	}
}
