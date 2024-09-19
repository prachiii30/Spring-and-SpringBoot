package org.Prachi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Autowired   //field Injection
    @Qualifier("desktop")
    private Computer com;
    private int age;


    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void code(){
        System.out.println("you are coding in Alien");
        com.compile();

    }




}
