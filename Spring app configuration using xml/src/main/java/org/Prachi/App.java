package org.Prachi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        Alien obj=(Alien)context.getBean("alien");
        Alien ob2=(Alien)context.getBean("alien");
        obj.code();
        System.out.println(obj.getAge());
        System.out.println(obj.getMoon());
    }


}
