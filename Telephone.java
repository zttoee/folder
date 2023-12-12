package com.salesforce.abs;

public class Telephone extends Phone{
	private boolean power;
	
	public void power(boolean on) {
		this.power = on;
	}
	
	public void call(String number) {
		if(power) {
			System.out.print(this.getNumber() + " 에서 ");
			System.out.println(number + "로 전화를 겁니다");
		}else {
			System.out.println("전원이 꺼져 있습니다.");
		}
		
	}

}
