package com.dependency_injection.main.Model;


import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Campus {

    String University;
    public Campus()
    {
        System.out.println("No Arg Constructor is Called (Campus) ! ");
    }

    public String campus_name()
    {
        return University;

    }

    public String getUniversity() {
        return University;
    }

    public void setUniversity(String university) {
        this.University = university;
    }

    @PreDestroy
    public  void disp()
    {
        System.out.println("Object destroyed (Campus) ");
    }
}
