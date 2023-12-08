package com.javaex.helloworld;

import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요");
		int num = sc.nextInt();
		int days = 0; 
		
		switch (num) {
		case 2: 
			days = 28;
			System.out.print(days + "일 입니다.");
			break;
			
		case 4: 
		case 6: 
		case 9: 
		case 11: 
			days = 30;
			System.out.print(days + "일 입니다.");
			break;
		
		default:
			days = 31;
			System.out.print(days + "일 입니다.");
			break;
		
		}
		sc.close();

	}

}
