package com.javaex.helloworld;

public class Practice01 {

	public static void main(String[] args) {
		// 1~100 사이의 5,7 공배수 모두 출력
		
		for(int i=1 ; i<=100 ; i++) {
			if (i%5==0 && i%7==0) {
				System.out.println(i);
				
			}
		}

	}

}
