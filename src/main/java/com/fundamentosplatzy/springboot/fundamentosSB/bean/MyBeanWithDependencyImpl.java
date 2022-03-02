package com.fundamentosplatzy.springboot.fundamentosSB.bean;

public class MyBeanWithDependencyImpl implements MyBeanWithDependency{

    private MyOperation myOperation;

    public MyBeanWithDependencyImpl(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        System.out.println(myOperation.suma(10));
        System.out.println("Hola desde la implementacion de un bean con dependencia.");
    }
}
