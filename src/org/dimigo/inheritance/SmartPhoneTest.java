package org.dimigo.inheritance;

public class SmartPhoneTest {
    public static void main(String[] args) {
        SmartPhone p1 = new iPhone("iPhone XS", "애플", 1370000);
        SmartPhone p2 = new Galaxy("갤럭시 S10", "삼성", 1500000);

        System.out.println(p1);
        p1.turnOn();
        p1.pay();
        p1.useSpecialFunction();
        p1.turnOff();
        System.out.println();

        System.out.println(p2);
        p2.turnOn();
        p2.pay();
        p2.useSpecialFunction();
        p2.turnOff();
    }
}
