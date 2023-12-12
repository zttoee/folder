package Com.salesforce.pratice03;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        
        //코드작성
    	if("앱".equals(str)){
            playApp();
        }else{
            super.execute(str);
        }
    	

    }
 
    //메소드작성
    protected void playApp(){
        System.out.println("앱실행");
    }
    //메소드작성
    protected void playMusic(){
        System.out.println("다운로드해서 음악재생");
    } 
   

    
    
}


//if("음악".equals(str)){
//    playMusic();
//}else{
//    super.execute(str);
//}
//
//if("통화".equals(str)){
//    call();
//}else{
//    super.execute(str);
//}