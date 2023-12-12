package com.salesforce.practice03;


public class CConverterApp {

    public static void main(String[] args) {

        double dollar;
        double won;
        
        CConverter.setRate(1318.40);
        
        //백만원을 달러로 출력
        won = 1000000;
        System.out.println("백만원은 "+ CConverter.toDoller(won) + " 달러 입니다");
        
        //100달러를 원으로 출력
        dollar = 100;
        System.out.println("백달러는 "+ CConverter.toKRW(dollar) + " 원 입니다");
    }

}
