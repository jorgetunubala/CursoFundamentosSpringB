package com.fundamentosplatzy.springboot.fundamentosSB.bean;

public class MiCarroConDependenciaImpl implements MiCarroConDependencia{

    private  CarroBean carroBean;

    public MiCarroConDependenciaImpl(CarroBean carroBean) {
        this.carroBean = carroBean;
    }

    @Override
    public void iniciarCarro() {
        System.out.println("Se inicia el carro, a continuacion avanza el carro desde su posicion inicial 0.");
        int nuevaPosicion = carroBean.avanzar(0, 10);
        System.out.printf("La nueva posicion del carro es: "+nuevaPosicion);

    }
}
