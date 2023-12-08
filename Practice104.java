package com.javaex.helloworld;

import java.util.Scanner;

public class Practice104 {

	public static void main(String[] args) {
		//가장 큰 수 찾기
		int num = 0;
		int max = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자: ");
		for(int i=0  ; i<5 ; i ++) {
			num = sc.nextInt();
			if(max < num) {
				max = num;
			}			
		}
		System.out.println("최대값은 " + max + "입니다");
		sc.close();
	}

}