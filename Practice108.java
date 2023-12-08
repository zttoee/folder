package com.javaex.helloworld;

import java.util.Scanner;

public class Practice108 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int money = 0; //사용자 입력할 금액
		int total = 0; //잔액
		int select = 0; //사용자 입력용
		
		while(true) {
			System.out.println("---------------------------------");
			System.out.println(" 1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
			System.out.println("---------------------------------");
			System.out.print("선택>");
			select = sc.nextInt();
				
				if (select == 1) {
					System.out.print("예금액>");
					money = sc.nextInt();
					total += money; 
				
				}else if (select == 2) {
					System.out.print("출금액>");
					money = sc.nextInt();
					total -= money; 
				
				}else if (select == 3) {
					System.out.println("잔고액>"+total);
					
				}else if (select == 4) {
					System.out.print("프로그램 종료");
					break;
					
				}else {
					System.out.println("다시 입력해주세요");
					
				}
			}
		sc.close();
	}
}


