package com.javaex.helloworld;

import java.util.Scanner;

public class WhileEx03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 메세지 출력
		System.out.println("단을 입력해주세요");
		System.out.print("단: ");
		
		// dan 값 입력
		int dan = sc.nextInt();
		
		for(int i = 1; i < 10 ; i++) {
			System.out.println(dan + " * " + i + " = " + dan*i);
			
		}
		sc.close();

	}

}
