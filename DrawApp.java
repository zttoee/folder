package Com.salesforce.pratice03;

public class DrawApp {

	public static void main(String[] args) {


		Shape c = new Circle2();
		
		// 객체가 Circle 클래스의 인스턴스 인가?
		System.out.println( c instanceof Circle2 );
		
		// 객체가 Rectangle 클래스의 인스턴스 인가?
		System.out.println( c instanceof Rectangle2 );
		
		// 객체가 Shape 클래스의 인스턴스 인가?
		System.out.println( c instanceof Shape );

		Drawable p = new Point();
		
		// 객체가 Circle 클래스의 인스턴스 인가?
		System.out.println( p instanceof Circle2 );
		
		// 객체가 Rectangle 클래스의 인스턴스 인가?
		System.out.println( p instanceof Rectangle2 );
		
		// 객체가 Shape 클래스의 인스턴스 인가?
		System.out.println( p instanceof Shape );
		
		// 객체가 Shape 클래스의 인스턴스 인가?
		System.out.println( p instanceof Drawable );

	}

}
