package exercise2;

public class Main {
	public static void main(String[] args) {
		//testing shape
		Shape s1 = new Shape();
		Shape s2 = new Shape("red", true);

		System.out.println("------");
		System.out.println("Shape");
		System.out.println("------");
		
		s1.setColor("blue");
		System.out.println(s1.toString());
		s2.setFilled(false);
		System.out.println(s2.toString());
		
		//testing circle
		Circle c1 = new Circle();
		Circle c2 = new Circle(7.0);
		Circle c3 = new Circle(5.0, "blue", false);

		System.out.println("\n-------");
		System.out.println("Circle");
		System.out.println("-------");
		
		c1.setColor("red");
		System.out.println(c1.toString());
		System.out.println("Area: " + c1.getArea() + ", Perimeter: " + c1.getPerimeter());
		c2.setFilled(false);
		System.out.println(c2.toString());
		System.out.println("Area: " + c2.getArea() + ", Perimeter: " + c2.getPerimeter());
		System.out.println(c3.toString());
		System.out.println("Area: " + c3.getArea() + ", Perimeter: " + c3.getPerimeter());
		
		//testing rectangle
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(10.0, 15.0);
		Rectangle r3 = new Rectangle(5.0, 2.5, "red", true);

		System.out.println("\n----------");
		System.out.println("Rectangle");
		System.out.println("----------");
		
		r1.setColor("green");
		System.out.println(r1.toString());
		System.out.println("Area: " + r1.getArea() + ", Perimeter: " + r1.getPerimeter());
		r2.setFilled(false);
		System.out.println(r2.toString());
		System.out.println("Area: " + r2.getArea() + ", Perimeter: " + r2.getPerimeter());
		System.out.println(r3.toString());
		System.out.println("Area: " + r3.getArea() + ", Perimeter: " + r3.getPerimeter());
		

		//testing square
		Square sq1 = new Square();
		Square sq2 = new Square(8.0);
		Square sq3 = new Square(3.5, "purple", true);

		System.out.println("\n-------");
		System.out.println("Square");
		System.out.println("-------");
		
		sq1.setColor("black");
		System.out.println(sq1.toString());
		System.out.println("Area: " + sq1.getArea() + ", Perimeter: " + sq1.getPerimeter());
		System.out.println(sq2.toString());
		System.out.println("Area: " + sq2.getArea() + ", Perimeter: " + sq2.getPerimeter());
		System.out.println(sq3.toString());
		System.out.println("Area: " + sq3.getArea() + ", Perimeter: " + sq3.getPerimeter());
	}
}
