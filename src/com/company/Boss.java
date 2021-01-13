package com.company;

public class Boss {
    private int damage;
    private  int hp;
    private String protektion;

    public Boss(int damage, int hp, String protektion) {
        this.damage = damage;
        this.hp = hp;
        this.protektion = protektion;
    }

    public Boss() {

    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getProtektion() {
        return protektion;
    }

    public void setProtektion(String protektion) {
        this.protektion = protektion;
    }
}
