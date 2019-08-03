package com.company.factory_method.factory;

import com.company.factory_method.objects.Button;

public abstract class FactoryMethod {

    public void render(){

        createButton().onClick();
    }

    public abstract Button createButton();

}
