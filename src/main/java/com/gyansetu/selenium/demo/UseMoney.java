package com.gyansetu.selenium.demo;

public class UseMoney {
    public static void main(String[] args) {
        Money m = new Money();
        System.out.println("first amout is ");
        m.show();
        Money money2 = new Money(100, 20);
        System.out.println("Second amount is  ");
        money2.show();
        m.set(200,45);
        System.out.println("first anout is");
        m.show();
        Money money3=new Money(money2);
        System.out.println("Third amount is ");
        money3.show();
    }
}
