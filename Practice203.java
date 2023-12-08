package com.javaex.helloworld;

import java.util.Scanner;

public class Practice203 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] data = {50000,10000,5000,1000,500,100,50,10,5,1};
		
		int num;
		System.out.print("금액: ");
		num = sc.nextInt();
		
		int count;
			
		for (int i=0; i<data.length; i++) {
			
			if (num/data[i]>=1) {
				count=num/data[i];
				System.out.println(data[i]+"원:"+ count+"개");
				num -= data[i]*count;			
				
			}else {
				continue;
			}
				
			sc.close();
				
			}	
	}	

}


