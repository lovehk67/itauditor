public class I2021A32 {
	private int a = 0;
	private static int count = 0;
	public int getA() { return a; }
	public static int getCount() { return count; }
	public static void main(String args[]) {
		int sum = 0;
		sum = a; // compile error
		sum += count;
		System.out.println(getA()); // compile error
		System.out.println(getCount());
	}
}
