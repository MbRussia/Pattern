package com.company.factory_method.factory;

import com.company.factory_method.objects.Button;
import com.company.factory_method.objects.ButtonB;

public class FactoryMethodB extends FactoryMethod {
    @Override
    public Button createButton() {
        return new ButtonB();
    }
}
