package com.company.factory_method;

import com.company.factory_method.factory.FactoryMethod;
import com.company.factory_method.factory.FactoryMethodA;
import com.company.factory_method.factory.FactoryMethodB;

public class Demo {
    private static FactoryMethod factoryMethod;

    public static void main(String[] args) {
        configure();
        factoryMethod.render();
    }

    private static void configure() {
        System.out.println(System.getProperty("os.name"));
        if (System.getProperty("os.name").equals("Mac OS X")) {
            factoryMethod = new FactoryMethodA();
        } else {
            factoryMethod = new FactoryMethodB();
        }

    }
}
