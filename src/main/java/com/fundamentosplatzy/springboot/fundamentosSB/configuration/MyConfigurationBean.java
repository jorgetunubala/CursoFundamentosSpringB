package com.fundamentosplatzy.springboot.fundamentosSB.configuration;

import com.fundamentosplatzy.springboot.fundamentosSB.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {

    @Bean
    public MyBean MyBeanInterfaceOperation(){
        return new MyBean2Implement();
    }

    @Bean
    public MyOperation beanOperationOperation(){
        return new MyOperationImplement();
    }

    @Bean
    public MyBeanWithDependencyImpl beanOperationImplementWithDependency(MyOperation myOperation){
        return new MyBeanWithDependencyImpl(myOperation);
    }

    @Bean
    public CarroBean carroBeanDependencia(){
        return new CarroBeanImpl();
    }

    @Bean
    public MiCarroConDependenciaImpl miCarroConDependenciaImplConDependencia(CarroBean carroBean){
        return new MiCarroConDependenciaImpl(carroBean);
    }
}
