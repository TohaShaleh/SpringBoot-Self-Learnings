package com.practice_project.main.Model;


import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component  // By this annotation, it Marks this class as a Spring bean.
@Scope(value = "prototype")   // Specifies that this bean should have a prototype scope.it can't have more than one object
public class Coder {

    private int id;
    String name;

    @Autowired
    Computer computer;    // Autowired annotation means it injects an Computer instance as Dependency injection in this class..


    public Coder()
    {
        System.out.println("No Arg Constructor Called (Coder) !!");
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Computer getComputer() {     // Access a Computer instance through this method.
                                        // returns the Computer instance that was injected into c1
                                        // through dependency injection (the Computer bean)
        return computer;

    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }


    public void display()
    {
        System.out.println();
        System.out.println(name+" and his id is "+id);
        System.out.println("The brand name is "+computer.getBrand());   // Accessing fields directly " like computer.brand " can break encapsulation.
                                                                        // Instead, using computer.getBrand() is more maintainable and keeps the code cleaner.
        System.out.println();
    }


    //The @PreDestroy method will be called just before the bean is destroyed, which is helpful for cleanup tasks.
    @PreDestroy   // Automatically calls this method at the finishing point
    public void Destroy()
    {
        System.out.println("Object Destroyed (Coder) ");
    }


}
