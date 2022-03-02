package com.fundamentosplatzy.springboot.fundamentosSB.bean;

public class CarroBeanImpl implements CarroBean{

    @Override
    public int avanzar(int posicionInicial, int kilometros) {
        return posicionInicial + kilometros;
    }

}
