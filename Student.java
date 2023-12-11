package com.salesforce;

public class Student extends Person {
	private String schoolName;

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public Student() {
		super();
	}

	public Student(String schoolName) {
		super();
		this.schoolName = schoolName;
		System.out.println("Student 클래스의 기본 생성자 호출됨!!");
	}

	public Student(String name, int age, String schoolName) {
		this(schoolName);
		this.setAge(age);
		this.setName(name);
		
	}

	public String toString() {
		return "Student [schoolName=" + schoolName + "name=" + this.getName() + ", age=" + this.getAge() + "]";
	}
	
}
