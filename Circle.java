package Com.salesforce.pratice03;

public class Circle extends Shape {
	
	private int radius;
	private double PI = 3.14;

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		
		return radius * radius * PI;
	}

}
