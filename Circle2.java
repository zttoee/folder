package Com.salesforce.pratice03;

public class Circle2 extends Shape implements Drawable {
	
	private int radius;
	private double PI = 3.14;

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		
		return radius * radius * PI;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

}
