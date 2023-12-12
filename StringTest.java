package Com.salesforce.pratice03;

public class StringTest {

	public static void main(String[] args) {
		String s = "apple mango banana";
		String[] sArr = s.split(" ");
		
		for (int i=0; i<sArr.length; i++) {
			System.out.println(sArr[i]);
		
		}
		
		Friend[] fArr = null;
		fArr[0] = new Friend("","","");

	}

}
