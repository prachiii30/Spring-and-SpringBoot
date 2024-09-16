package org.Prachi;


//import jdk.jpackage.internal.ApplicationLayout;
import org.Prachi.config.AppConfig;
import org.Prachi.config.Laptop;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

        //be default the bean name is your method name
        Desktop desk=context.getBean("dt",Desktop.class);
        desk.compile();
        Desktop desk2=context.getBean("dt",Desktop.class);
        desk.compile();

        //we can set our bean name @Bean(name="lappy")
        Laptop laptop =context.getBean("lappy",Laptop.class);
        laptop.compile();


    }
}
