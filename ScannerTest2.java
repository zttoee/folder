package com.javaex.helloworld;

import java.util.Scanner; // Scanner 클래스 호출

public class ScannerTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		
		System.out.println("나이를 입력하세요");
		String age = sc.nextLine();
		System.out.print("당신의 이름은 "+ name);
		System.out.println(" 나이는 " + age + "살 입니다");
		
		sc.close();

	}

}
