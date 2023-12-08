package com.javaex.helloworld;

public class ArrayTest01 {

	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		
		//6개를 입력
		for(int i=0 ; i<lotto.length ; i++) {
			int number = (int)(Math.random() * 45) + 1;
			lotto[i] = number;
		}
		
		//출력
		for(int i=0 ; i<lotto.length ; i++) {
			System.out.print(lotto[i] + " ");
		}

	}

}
