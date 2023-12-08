package com.javaex.helloworld;

public class WhileEx05 {

	public static void main(String[] args) {
		
		for(int j = 1  ; j < 11 ; j ++) {
			for(int i = 1;  ; i++) {
				if(i % 6 == 0 && i % 14 == 0) {
					System.out.println(i*j);
					break;
				}
			
		}
		}
		
	}
}
			
/*
package com.javaex.helloworld;

public class WhileEx04 {

	public static void main(String[] args) {
		int i = 1;
		int cpunt = 0;
		while(count < 10) {
			if(i % 6 == 0 && i % 14 == 0) {
				count++;
				System.out.println(i);
				continue;
			}
			i++;
		}
	}
}
		
		

 */		