
package com.khanarmy.heroes;

public class Hero {
    String name;
    int power;

    public Hero(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public void attack() {
        System.out.println(name + " attacks with power " + power);
    }
}
