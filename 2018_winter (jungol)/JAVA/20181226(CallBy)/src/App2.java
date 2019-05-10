
public class App2 {
	
	public static void main(String args[]) {
		int[] a = {1,2,3};
		for(int i : a) {
			System.out.println(i);
		}
		test(a);
		for(int i : a) {
			System.out.println(i);
		}
		
		
	}
	public static void test(int[] moon) {
		moon[1] = 10;
	}
}
