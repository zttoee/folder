package com.javaex.problem07;
public class Account {
    private String accountNo;
    private int balance;
    public Account(String accountNo){
        this.accountNo = accountNo;
        System.out.println(this.accountNo + " 계좌가 개설되었습니다.");
    }
    public void deposit(int money){
        this.balance += money;
    }
    public void withdraw(int money){
        this.balance -= money;
    }
    public void showBalance(){
        System.out.println(balance);
    }
}
