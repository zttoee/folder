package com.salesforce;

public class Person {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person() {
		super();
		System.out.println("Person 클래스의 기본 생성자 호출됨!!");
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
