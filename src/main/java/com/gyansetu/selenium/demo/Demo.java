package com.gyansetu.selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int x, y;
        float f1, f2;
        x = calculator.sum(3, 4);
        System.out.println("3+4=" + x);
        y = calculator.sum(3, 4, 5);
        System.out.println("3+4+5=" + y);
        f1 = calculator.sum(1.2f, 2.3f);
        System.out.println("1.2+2.3=" + f1);
        f2 = calculator.sum(1.2f, 3.4f, 4.6f);
        System.out.println("1.2+3.4+4.6=" + f2);


    }
}

