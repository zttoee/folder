package com.javaex.helloworld;

import java.util.Scanner;

public class Practice102 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		for(int i=1  ; i<=num ; i ++) {
			for(int j=1 ; j<=i ; j ++) {
				System.out.print(i);
		}
			System.out.print("\n");
		}
		sc.close();
	}

}
