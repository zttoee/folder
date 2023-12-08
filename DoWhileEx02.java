package com.javaex.helloworld;

import java.util.Scanner;

public class DoWhileEx02 {

	public static void main(String[] args) {
		int sum = 0;
		int input = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 (0이면 종료)");
		
		do {
			input = sc.nextInt();
			sum += input;
			System.out.println("합계 : " + sum);
		}while(input !=0) ;
		sc.close();
	}

}
