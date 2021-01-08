package com.company;

public class Hero {
    private int helth;
    private int damage;
    private String magic;


    public Hero(int helth, int damage, String magic) {
        this.helth = helth;
        this.damage = damage;
        this.magic = magic;
    }

    public Hero(int helth, int damage) {
        this.helth = helth;
        this.damage = damage;
    }

    public int getHelth() {
        return helth;
    }

    public void setHelth(int helth) {
        this.helth = helth;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getMagic() {
        return magic;
    }

    public void setMagic(String magic) {
        this.magic = magic;
    }
}





