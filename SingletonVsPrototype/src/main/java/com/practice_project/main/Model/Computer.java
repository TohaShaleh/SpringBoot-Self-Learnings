package com.practice_project.main.Model;

import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "singleton")  // If we create more than one objects of this class , every object will be same with the first created object..
public class Computer {
    String brand;

    public Computer()
    {
        System.out.println("No Arg Constructor Called (Computer) ");
    }

    public String getBrand()
    {
        return brand;
    }
    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public String brand_name()
    {
        return brand;
    }

    @PreDestroy   // Automatically calls this method at the finishing point
    public void preDestroy()
    {
        System.out.println("Object destroyed (Computer) ");
    }




}
