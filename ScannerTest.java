package com.javaex.helloworld;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
	
		System.out.print("당신의 이름은 "+ name +" 입니다");
		sc.close();

	}

}
