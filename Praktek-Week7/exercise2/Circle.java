package exercise2;

public class Circle extends Shape {
	private double radius;
	
	public Circle() { // 1st no-arg constructor
		radius = 1.0;
	}
	
	public Circle(double radius) { // 2nd constructor
		this.radius = radius;
	}
	
	public Circle(double radius, String color, boolean filled) { // 3rd constructor
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public double getPerimeter() {
		return radius*2*Math.PI;
	}
	
	public String toString() {
		return "A Circle with radius= " + radius + ", which is a subclass of " + super.toString();
	}
	
}
