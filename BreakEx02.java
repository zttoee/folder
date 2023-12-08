package com.javaex.helloworld;

import java.util.Scanner;

public class BreakEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num ;
		
		System.out.println("숫자를 입력해주세요\n");
		
		
		for(;;) {
			num = sc.nextInt();
			if(num==0) {
				System.out.println("종료");
				break;
			}else if(num %3 ==0) {
				System.out.println("3의 배수");
			}else {
				System.out.println("3의 배수가 아님");
			
			}
			
		}

	}

}
