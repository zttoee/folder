package com.javaex.helloworld;

public class VariableTest {

	public static void main(String[] args) {
		boolean isFun = true;
		System.out.println("isFun=[" + isFun + "]");
		
		char c = 'f';
		c = '한';
		System.out.println("c=[" + c + "]");
		
		long big = 999999999999999999L + 1000000001;
		System.out.println("big=[" + big + "]");
		
		// 1 + 2.0F 결과는?
		int i = 10;
		float f = 2.0F;
		float result = i + f;
		System.out.println("result=[" + result + "]");
		System.out.println("i=[" + i + "]");
		
		int b = i++;
		System.out.println("b=[" + b + "]");
		System.out.println("i=[" + i + "]");
		
		
		System.out.println("안녕\\하세요"); 
		System.out.println("\"안녕하세요\""); 
	
		
		
	}

}
