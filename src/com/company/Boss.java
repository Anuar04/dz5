package com.company;

public class Boss {
    private int health;
    private int damage;
    private String attacksType;

    public Boss(int health, int damage, String attacksType) {
        this.health = health;
        this.damage = damage;
        this.attacksType = attacksType;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setAttacksType(String attacksType) {
        this.attacksType = attacksType;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getAttacksType() {
        return attacksType;
    }
}
