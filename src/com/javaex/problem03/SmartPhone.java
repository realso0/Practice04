package com.javaex.problem03;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        //코드작성
        if (str.equals("앱")) {
        	System.out.println("앱실행");
        } else if (str.equals("음악")) {
        	playMusic();
        } else if (str.equals("통화")) {
        	call();
        }
        //else { 
    	//	super.execute(str);
    	//}
    }
 
    //메소드작성
    public void call(){
        System.out.println("통화기능시작");
    }
    //메소드작성
    protected void playMusic(){
        System.out.println("다운로드해서 음악재생");
    }
    
    
}
