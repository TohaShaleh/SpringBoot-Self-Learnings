package com.dependency_injection.main.Model;


import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Coder {

    private int id;
    String name;

    @Autowired
    Computer computer;    // Autowired annotation means it injects an Computer instance as Dependency injection in this class..

    @Autowired
    Campus campus;

    public Coder()
    {
        System.out.println("No Arg Constructor Called (Coder) !!");
    }
    public Coder(int id, String name, Computer computer)
    {
        this.id=id;
        this.name=name;
        this.computer=computer;
        System.out.println("Arg Constructor is called (Coder) ");
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

    public Campus getCampus() {
        return campus;
    }

    public void setCampus(Campus campus) {
        this.campus = campus;
    }

    public void display()
    {
        System.out.println();
        System.out.println(name+" and his id is "+id);
        System.out.println("The brand name is "+computer.brand);
        System.out.println(name+" is from "+campus.University);
        System.out.println();
    }

    @PreDestroy   // Automatically calls this method at the finishing point
    public void Destroy()
    {
        System.out.println("Object Destroyed (Coder) ");
    }


}
