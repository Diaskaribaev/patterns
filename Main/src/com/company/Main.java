package com.company;

public class Main {

    public static void main(String[] args) {
        Queen queen = new Queen();
        queen.display();
        queen.performWeapon();
        queen.setWeaponbehavior(new KnifeBehavior());
        queen.performWeapon();
    }
}
