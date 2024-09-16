package org.Prachi;

import java.beans.ConstructorProperties;

public class Alien  {
    //contructor
    Alien(){
        System.out.println("obj created");
    }

    //Parameterized constructor for constructor injection
    Alien(int age){
        this.age=age;
    }


    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    private Computer com;
    @ConstructorProperties({"age","com"})
    Alien(int age,Computer com){
        this.age=age;
        this.com=com;
    }



    private  int age;
    private int moon;





    public int getMoon() {
        return moon;
    }

    public void setMoon(int moon) {
        this.moon = moon;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void code(){
        System.out.println("Coding starts !!!!");
        com.compile();



    }



}
