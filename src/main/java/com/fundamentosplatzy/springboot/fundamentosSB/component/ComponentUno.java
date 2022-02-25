package com.fundamentosplatzy.springboot.fundamentosSB.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentUno implements ComponentDependency{
    @Override
    public void saludar() {
        System.out.println("Hola mundo desde componente uno.");
    }
}
