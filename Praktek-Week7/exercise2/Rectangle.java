package exercise2;

public class Rectangle extends Shape {
	private double width;
	private double length;
	
	public Rectangle() { // 1st no-arg constructor
		width = 1.0;
		length = 1.0;
	}
	
	public Rectangle(double width, double length) { // 2nd constructor
		this.width = width;
		this.length = length;
	}
	
	public Rectangle(double width, double length, String color, boolean filled) { // 3rd constructor
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public double getArea() {
		return width*length;
	}
	
	public double getPerimeter() {
		return 2*(width+length);
	}
	
	public String toString() {
		return "A Rectangle with width= " + width + " and length= " + length + ", which is a subclass of " + super.toString();
	}
	
}