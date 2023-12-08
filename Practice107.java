package com.javaex.helloworld;

import java.util.Scanner;

public class Practice107 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int rnum = 0; //랜덤번호용
		int insert = 0; //사용자 입력용
		
		System.out.println("=====================");
		System.out.println("  [숫자맞추기게임 시작]");
		System.out.println("=====================");
		
		while(true) {
			rnum = (int)(Math.random() * 100) + 1;
			while(true) {
				
				System.out.print(">>");
				
				insert = sc.nextInt();
				if(insert == rnum) {
					System.out.println("맞았습니다.");
					break;		
				}else if(insert > rnum) {	
					System.out.println("더 낮게");
				}else {
					System.out.println("더 높게");
					
			}
			
		}
	
				System.out.print("게임을 종료하시겠습니까?(y/n) >>");
				sc.nextLine();
				String play = "";
				play = sc.nextLine();
		
				if ("y".equalsIgnoreCase(play)){
					System.out.println("=====================");
					System.out.println("  [숫자맞추기게임 종료]");
					System.out.println("=====================");
					break;
				}else {
					System.out.println("계속진행...");
		}
	}
		
	sc.close();
	}
}


