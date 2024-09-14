package com.prachi.SpringBootDemo.Wiring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ApplicationContext context= SpringApplication.run(Main.class,args);

        Programmer obj=context.getBean(Programmer.class);
        obj.code();

    }
}
