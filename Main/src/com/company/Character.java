package com.company;

public abstract class Character  {
    private WeaponBehavior weaponbehavior;

    public Character(WeaponBehavior weaponbehavior) {
        this.weaponbehavior = weaponbehavior;
    }

    public void performWeapon(){
        this.weaponbehavior.useWeapon();
    }

    public WeaponBehavior getWeaponbehavior() {
        return weaponbehavior;
    }

    public void setWeaponbehavior(WeaponBehavior weaponbehavior) {
        this.weaponbehavior = weaponbehavior;
    }

    public abstract void display();
}
