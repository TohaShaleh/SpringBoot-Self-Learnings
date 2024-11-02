package com.dependency_injection.main.Model;

import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private String brand;
    public Computer()
    {
        System.out.println("No Arg Constructor Called (Computer) ");
    }
    public Computer(String brand)
    {
        this.brand=brand;
        System.out.println("Arg Constructor is called (Computer) ");
    }

    public String getBrand()
    {
        return brand;
    }
    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public String display()
    {
        return brand;
    }

    @PreDestroy   // Automatically calls this method at the finishing point
    public void preDestroy()
    {
        System.out.println("Object destroyed (Computer) ");
    }




}
