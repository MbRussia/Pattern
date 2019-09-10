package com.company.builder;

import com.sun.jdi.Value;

public class WarriorBuilder {
    private int healths;
    private int attack;
    private Class clazz;

    public Warrior build() {
        Warrior warrior;
        if (clazz == Archer.class) {
            warrior = new Archer();
        } else {
            warrior = new Viking();
        }

        warrior.setHealths(healths);
        warrior.setAttack(attack);
        return warrior;
    }

    public WarriorBuilder withHealth(int health) {
        healths = health;
        return this;
    }

    public WarriorBuilder withAttack(int attack) {
        this.attack = attack;
        return this;
    }

    public WarriorBuilder withClazz(Class clazz) {
        this.clazz = clazz;
        return this;
    }

}
