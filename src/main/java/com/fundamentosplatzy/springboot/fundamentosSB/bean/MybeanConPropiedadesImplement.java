package com.fundamentosplatzy.springboot.fundamentosSB.bean;

public class MybeanConPropiedadesImplement implements MyBeanConPropiedades{

    private String nombre;
    private String apellido;

    public MybeanConPropiedadesImplement(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String function() {
        return nombre + " - "+ apellido;
    }
}
