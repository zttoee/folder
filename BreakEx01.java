package com.javaex.helloworld;

import java.util.Scanner;

public class BreakEx01 {

	public static void main(String[] args) {
		while(true) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요");
		int num = sc.nextInt();
		
		
			if(num % 3 == 0) {
				if(num !=0) {
					System.out.println("3의 배수");
					continue;
				}
				else if (num == 0) {
					System.out.println("종료");
					break;
				}
			}
			
			else if(num % 3 != 0) {
				System.out.println("3의 배수가 아닙니다");
				continue;

			
			}
			
		sc.close();

	}

	}
}

	
