class Temp {
	private static Temp t;
	private int m = 0;
	public Temp() { }
	public static Temp getTemp() {
		if (t == null) t = new Temp();
		return t;
	}
	public int add(int i) {
		m += i;
		return m;
	}
}

public class E2016A31 {
	public static void main(String args[]) {
		Temp obj1 = new Temp();
		Temp obj2 = new Temp();
		System.out.println(obj1.add(5) + " "); // 5
		System.out.println(obj2.add(5) + " "); // 5
		Temp obj3 = Temp.getTemp();
		Temp obj4 = Temp.getTemp();
		System.out.println(obj3.add(5) + " "); // 5
		System.out.println(obj4.add(5)); // 10
	}
}
