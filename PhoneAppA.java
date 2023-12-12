package Com.salesforce.pratice03;

public class PhoneAppA{

	public static void main(String[] args) {
		TelephoneA t = new TelephoneA();
		t.power(true);
		t.setNumber("81-10-1111-2222");
		t.call("1-555-1234-5678");
		
		SmartphoneA s = new SmartphoneA();
		s.turnOn(true);
		s.setNumber("81-10-1111-2222");
		s.call("1-555-1234-5678");
		s.searchInternet("Naver.com");

	}

}
