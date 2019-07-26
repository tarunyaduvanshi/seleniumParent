package com.gyansetu.selenium.demo;

public class Money {
    private int rs;
    private int paisa;

    public Money() {
        rs = paisa = 0;

    }

    public Money(int r, int p) {
        rs = r;
        paisa = p;
    }

    public Money(Money m) {
        rs = m.rs;
        paisa = m.paisa;
    }

    public void set(int r, int p) {
        rs = r;
        paisa = p;
    }


    public void show() {
        System.out.println(rs + "," + paisa);
    }

}
