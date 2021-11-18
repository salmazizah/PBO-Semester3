package kasus1;

public class Cylinder extends Shape{
	private double radius;
	private double height;
	
	public Cylinder(double r, double h) { // constructor
		super("Cylinder");
		radius = r;
		height = h;
	}
	
	@Override
	public double area() { // return the surface area of the Cylinder
		return Math.PI*radius*radius*height;
	}
	
	public String toString() { // return the Cylinder as a string
		return super.toString() + " of radius " + radius + " and height " + height;
	}
}
