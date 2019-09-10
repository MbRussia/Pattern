package com.company.builder;

public class Viking implements Warrior {
    private int healths;
    private int attack;

    @Override
    public int attack() {
        return attack;
    }

    @Override
    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public void damage(int damage) {
        this.healths -= damage;
    }

    @Override
    public void setHealths(int healths) {
        this.healths = healths;
    }

    @Override
    public int getHealths() {
        return healths;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Viking{");
        sb.append("healths=").append(healths);
        sb.append(", attack=").append(attack);
        sb.append('}');
        return sb.toString();
    }
}
