package com.company;

public class Main {

    public static void main(String[] args) {

        //Process
        Weapon weapon = new Weapon();
        Boss boss = new Boss();
        weapon.setWeaponName("Machete");
        weapon.setWeaponType("Sword");
        boss.setHeals(1500);
        boss.setDamage(100);
        boss.setWeapon(weapon);

        //Output
        System.out.println("Boss information\n"+
                "--------------------\n"+
                "Health:"+boss.getHeals()+
                "\nDamage:"+boss.getDamage()+
                "\nWeapon name:"+boss.getWeapon().getWeaponName()+
                "\nWeapon type:"+boss.getWeapon().getWeaponType());

    }
}
