package com.javaex.helloworld;

public class WhileEx04 {

	public static void main(String[] args) {
		
		
		for(int i = 1;  ; i++) {
			if(i % 6 == 0 && i % 14 == 0) {
				System.out.println(i);
				break;
			}	
		
		}
	}
}
			
