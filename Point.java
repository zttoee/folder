package Com.salesforce.pratice03;

public class Point implements Drawable {
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	//모든 필드 초기화 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//기본 생성자
	public Point() {
		
	}
	
	public void draw() {
		System.out.print("점 [x=" + this.getX() );
		System.out.print(", y=" + this.getY() );
		System.out.print("]을 그렸습니다.\n" );
	}
	
	
	public void draw(boolean isDelete) {
		
		if(!isDelete) {
			System.out.print("점 [x=" + this.getX() );
			System.out.print(", y=" + this.getY() );
			System.out.print("]을 지웠습니다.\n" );
		}
		
		
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	public void draw(int check) {
		
		if(check == 0) {
			System.out.print("점 [x=" + this.getX() );
			System.out.print(", y=" + this.getY() );
			System.out.print("]을 지웠습니다.\n" );
		}
	}
	

}
