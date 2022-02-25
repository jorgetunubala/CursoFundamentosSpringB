package com.fundamentosplatzy.springboot.fundamentosSB;

import com.fundamentosplatzy.springboot.fundamentosSB.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosSbApplication implements CommandLineRunner {

	private ComponentDependency componentDependency;

	public FundamentosSbApplication(@Qualifier("componentDos") ComponentDependency componentDependency){
		this.componentDependency = componentDependency;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosSbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		componentDependency.saludar();
	}
}
