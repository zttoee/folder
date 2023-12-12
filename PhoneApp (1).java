package com.salesforce.abs;

public class PhoneApp {

	public static void main(String[] args) {
		Telephone t = new Telephone();
		t.power(true);
		t.setNumber("81-10-1111-2222");
		t.call("1-555-1234-5678");
		
		Smartphone s = new Smartphone();
		s.turnOn(true);
		s.setNumber("81-10-3333-4545");
		s.call("1-555-1234-5678");
		s.searchInternet("Naver.com");
	}

}
