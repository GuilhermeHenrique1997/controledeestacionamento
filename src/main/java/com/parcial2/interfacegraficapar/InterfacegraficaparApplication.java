package com.parcial2.interfacegraficapar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages ={"com.parcial2.*"})
public class InterfacegraficaparApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterfacegraficaparApplication.class, args);
	}
}
