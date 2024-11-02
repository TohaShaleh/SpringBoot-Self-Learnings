package com.dependency_injection.main;

import com.dependency_injection.main.Model.Coder;
import com.dependency_injection.main.Model.Computer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Main.class, args);

		Coder c1=context.getBean(Coder.class);   // For creating an object of any class ,
		// We need to call a class by getBean


		c1.display();     // Everything will return as null bcz doesnt save any value yet

		c1.setId(1001);
		c1.setName("Abu Shaleh Toha");
		c1.getComputer().setBrand("Intel Corei 7");
		c1.getCampus().setUniversity("RUET");
		c1.display();



		Computer com1=context.getBean(Computer.class);
		com1.setBrand("Macbook Air M1");
		c1.setComputer(com1);
		c1.display();



	}

}
