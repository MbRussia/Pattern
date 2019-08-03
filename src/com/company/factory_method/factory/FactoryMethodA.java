package com.company.factory_method.factory;

import com.company.factory_method.objects.Button;
import com.company.factory_method.objects.ButtonA;

public class FactoryMethodA extends FactoryMethod {
    @Override
    public Button createButton() {
        return new ButtonA();
    }
}
