package com.javaex.helloworld;

import java.util.Scanner;

public class IfElseEx03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("과목을 선택하세요");
		System.out.println("(1.Java 2.C 3.C++ 4.Python)");
		System.out.print("과목번호: ");
		int num = sc.nextInt();
		
		if(num == 1){
			System.out.print("R101호 입니다.");
			
		} else if(num == 2){
			System.out.print("R202호 입니다.");
			
		} else if(num == 3){
			System.out.print("R303호 입니다.");
			
		} else if(num == 4){
			System.out.print("R404호 입니다.");
			
		} else {
			System.out.print("상담원에게 문의하세요");
			
		}
		sc.close();
	}

}
