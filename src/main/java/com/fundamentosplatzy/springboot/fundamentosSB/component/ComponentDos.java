package com.fundamentosplatzy.springboot.fundamentosSB.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentDos implements ComponentDependency{
    @Override
    public void saludar() {
        System.out.println("Hola desde componente dos.");
    }
}
