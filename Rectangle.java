package Com.salesforce.pratice03;

public class Rectangle extends Shape{
	private int lineA;
	private int lineB;

	public void setLineA(int lineA) {
		this.lineA = lineA;
	}

	public void setLineB(int lineB) {
		this.lineB = lineB;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return lineA * lineB;
	}


}


