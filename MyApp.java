package com.salesforce;

public class MyApp {

	public static void main(String[] args) {
		int x = MyMath.plus(5, 10);
	  System.out.println(x);
	  
	  MyMath mm = new MyMath();
//	  int y = mm.plus(3, 8);
//	  System.out.println(y);
	  System.out.println(MyMath.plus(1.0, 4.0));
	  System.out.println(MyMath.circleArea(3));
	  
	  System.out.println(mm.circleArea(3));
	}

}
