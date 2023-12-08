package com.javaex.helloworld;

import java.util.Scanner;

public class ScannerIf02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int score = sc.nextInt();
		
		if(score >= 90){
			System.out.print("A등급");
			
		} else if(score >= 80 && score < 90){
			System.out.print("B등급");
			
		} else if(score >= 70 && score < 80){
			System.out.print("C등급");
			
		} else if(score >= 60 && score < 70){
			System.out.print("D등급");
			
		} else {
			System.out.print("F등급");
			
		}
		sc.close();

	}

}
