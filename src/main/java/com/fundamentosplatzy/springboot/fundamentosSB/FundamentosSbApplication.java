package com.fundamentosplatzy.springboot.fundamentosSB;

import com.fundamentosplatzy.springboot.fundamentosSB.bean.*;
import com.fundamentosplatzy.springboot.fundamentosSB.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosSbApplication implements CommandLineRunner {

	private ComponentDependency componentDependency;
	private MyBean myBean;
	private MyOperation myOperation;
	private MyBeanWithDependency myBeanWithDependency;
	private CarroBean carroBean;
	private MiCarroConDependencia miCarroConDependencia;

	public FundamentosSbApplication(@Qualifier("componentDos") ComponentDependency componentDependency, MyBean myBean, MyOperation myOperation,
									MyBeanWithDependency myBeanWithDependency, CarroBean carroBean, MiCarroConDependencia miCarroConDependencia){
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.myOperation = myOperation;
		this.myBeanWithDependency = myBeanWithDependency;
		this.carroBean = carroBean;
		this.miCarroConDependencia = miCarroConDependencia;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosSbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		componentDependency.saludar();
		myBean.print();
		myBeanWithDependency.printWithDependency();
		miCarroConDependencia.iniciarCarro();
	}
}
