package com.javaex.helloworld;

public class ContinueEx01 {

	public static void main(String[] args) {
		
		
		for(int i = 1; i <= 20 ; i++) {
			if(i % 2 == 0 || i % 3 ==0) {
				continue;
			// if(i % 2 == 0 || i % 3 ==0) continue; 도 가능!!
			}else{
				System.out.println(i);
				
			}
			
			
		}
		

	}

}