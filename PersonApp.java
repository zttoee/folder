package com.salesforce;

public class PersonApp {

	public static void main(String[] args) {
		Person p = new Person("정우성", 45);
		System.out.println(p);
		
		Student s1 = new Student("서울고등학교");
		System.out.println(s1);
		
		Student s2 = new Student("이정재", 45, "한국고등학교" );
		System.out.println(s2);
		
	}

}
