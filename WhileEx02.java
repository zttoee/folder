package com.javaex.helloworld;

import java.util.Scanner;

public class WhileEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan;
		int i = 1;
		
		// 메세지 출력
		System.out.println("단을 입력해주세요");
		System.out.print("단: ");
		// dan 값 입력
		dan = sc.nextInt();
	
		while(i < 10) {
			System.out.println(dan + " * " + i + " = " + dan*i);
			i++;
		}
		sc.close();

	}

}
