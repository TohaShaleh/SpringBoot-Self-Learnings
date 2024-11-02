package com.practice_project.main;

import com.practice_project.main.Model.Coder;
import com.practice_project.main.Model.Computer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Main.class, args);

		Coder c1=context.getBean(Coder.class);   // For creating an object of any class ,
		                                         // We need to call a class by getBean


		c1.setId(1001);
		c1.setName("Abu Shaleh Toha");
		c1.getComputer().setBrand("Intel Corei 7");
		c1.display();

		Coder c2=context.getBean(Coder.class);
		c2.display();     // Creates a new object , different from c1 object...

		System.out.println(c1==c2);   // It will give false



	}

}
