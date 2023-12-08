package com.javaex.helloworld;

import java.util.Scanner;

public class ScannerIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = sc.nextInt();
		
		switch (score % 3) {
		
		case 0:
			System.out.print("3의 배수입니다.");
			break;
		default:
			System.out.print(score + "은 3의 배수가 아닙니다.");
			break;
		}
		
		sc.close();
	}

}
