package Com.salesforce.pratice03;


public class StringUtil {
    
    public static String concatString(String[] arr){
       
        //메소드 내용작성
    	String resultStr = "";
    	for (int i=0 ; i<arr.length ;i++) {
    		resultStr += arr[i];
    	}
    	
		return resultStr;
        
    }

}
