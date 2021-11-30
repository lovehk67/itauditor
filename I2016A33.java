class Parent {
	public Parent() {
		System.out.println("Parent default"); // 1, 7
	}
	public Parent(int i) {
		this("hello");
		System.out.println("int constructor " + i); // 4
	}
	public Parent(char c) {
		this();
		System.out.println("char constructor " + c); // 2
	}
	public Parent(String s) {
		this('A');
		System.out.println("String constructor " + s); // 3
	}
}
class Child extends Parent {
	public Child() {
		super(10);
		System.out.println("Child default"); // 5
	}
	public Child(int i) {
		System.out.println("int constructor"); // 8
	}
}

public class I2016A33 {
	public static void main(String args[]) {
		Child c1 = new Child();
		System.out.println("-----"); // 6
		Child c2 = new Child(10);
	}
}
