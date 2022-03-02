package com.fundamentosplatzy.springboot.fundamentosSB.bean;

public class MyBeanImplement implements MyBean{
    @Override
    public void print() {
        System.out.println("Hola desde mi primer implementacion propia del bean.");
    }
}
