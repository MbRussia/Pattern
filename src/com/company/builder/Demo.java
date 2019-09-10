package com.company.builder;

public class Demo {
    public static void main(String[] args) {
        Warrior warrior = new WarriorBuilder().withAttack(20)
                .withHealth(100)
                .withClazz(Archer.class)
                .build();
        System.out.println(warrior);
    }
}
