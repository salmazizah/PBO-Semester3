package kasus1;

public class Sphere extends Shape{
	private double radius; // radius in feet
	
	public Sphere(double r) { // constructor
		super("Sphere");
		radius = r;
	}
	
	@Override
	public double area() { // return the surface area of the sphere
		return 4*Math.PI*radius*radius;
	}
	
	public String toString() { // return the sphere as a string
		return super.toString() + " of radius " + radius;
	}
}
