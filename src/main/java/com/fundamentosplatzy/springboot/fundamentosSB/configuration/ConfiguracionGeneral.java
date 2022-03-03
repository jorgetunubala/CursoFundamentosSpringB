package com.fundamentosplatzy.springboot.fundamentosSB.configuration;

import com.fundamentosplatzy.springboot.fundamentosSB.bean.MyBeanConPropiedades;
import com.fundamentosplatzy.springboot.fundamentosSB.bean.MybeanConPropiedadesImplement;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfiguracionGeneral {
    @Value("${value.name}")
    private String name;

    @Value("${value.apellido}")
    private String apellido;

    @Value("${value.random}")
    private String random;

    @Bean
    public MyBeanConPropiedades function(){
        return new MybeanConPropiedadesImplement(name, apellido);
    }
}
