abstract class Shape {
	public void paint() { draw(); }
	abstract public void draw();
}
abstract class Circle extends Shape {
	public int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	double getArea() {
		return (3.14 * radius * radius);
	}
}
public class G2021GA10 extends Circle {
	String name;
	public G2021GA10(int radius, String name) {
		super(radius);
		this.name = name;
	}
	public void draw() {
		System.out.println("Draw a circle with a radius of " +  radius);
	}

	public static void main(String args[]) {
		Shape s;
		s = new Shape(); // compile error
		G2021GA10 w = new G2021GA10(5, "Ring");
		System.out.println(w.getArea());
		w.draw();
	}
}
