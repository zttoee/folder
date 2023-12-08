package com.javaex.helloworld;

import java.util.Scanner;

public class IfElseEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
	
		if(num > 0){
			System.out.print("양수입니다.");
			
		} else if(num < 0){
			System.out.print("음수입니다.");
			
		} else {
			System.out.print("0입니다.");
		}
		sc.close();

	}

}
