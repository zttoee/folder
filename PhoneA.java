package Com.salesforce.pratice03;

public abstract class PhoneA {
	private String number;
	
	public void setNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public abstract void call(String number);

}



