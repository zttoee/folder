package com.javaex.helloworld;

public class Practice205 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		for(int i=0 ; i<lotto.length ; i ++) {
			int number = (int)(Math.random() * 45) + 1;
			lotto[i] = number;
			
			for(int j=0 ; j<i ; j++) {
				if (lotto[i] == lotto[j]) {
					lotto[i] = (int)(Math.random() * 45) + 1;
					j = 0;
					
			}	
			}
				
			
			System.out.print(lotto[i]+" ");
			
		}
		
		

	}

}

