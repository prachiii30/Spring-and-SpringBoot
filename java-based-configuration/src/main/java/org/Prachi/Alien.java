package org.Prachi;

public class Alien {


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
