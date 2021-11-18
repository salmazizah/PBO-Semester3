package kasus1;

public abstract class Shape {
	// instance variable
	private String shapeName;
	
	// abstract method
	public abstract double area();
	
	// constructor method, set the shape name
	public Shape(String name) {
		this.shapeName = name;
	}
	
	// toString method, return the name of the shape
	public String toString() {
		return shapeName;
	}
}