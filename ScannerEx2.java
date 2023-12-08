package com.javaex.helloworld;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = sc.nextInt();
	
		if(score >= 60){
			System.out.print("합격입니다.");
			
		} else {
			System.out.print("불합격입니다.");
			
		}
		sc.close();

	}

}
