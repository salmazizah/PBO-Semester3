package exercise2;

public class Square extends Rectangle {
	public Square()	{
		super();
	}
	
	public Square(double side) {
		super(side, side); // Call superclass Rectangle(double, double)
	}

	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}
	
	public String toString() {
		return "A Square with side= " + super.getLength() + ", which is a subclass of " + super.toString();
	}
	
	public void setSide(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	
	public double getSide() {
		return super.getWidth();
	}
	
}
