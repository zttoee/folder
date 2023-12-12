package com.salesforce.abs;

public class Smartphone extends Phone{
	private boolean power;
	
	public void turnOn(boolean on) {
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
	
	public void searchInternet(String url) {
		if(power) {
			System.out.println("브라우저에서 " + url + "로 검색 합니다.");
		}else {
			System.out.println("전원이 꺼져 있습니다.");
		}
	}

}
