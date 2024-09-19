package org.Prachi;

//import org.Prachi.config.AppConfig;
import org.Prachi.Config2.AppConfig2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext Context=new AnnotationConfigApplicationContext(AppConfig2.class);

        Desktop d= Context.getBean(Desktop.class);
        d.compile();
//        Desktop dd= Context.getBean(Desktop.class);
//        dd.compile();

        Laptop l=Context.getBean(Laptop.class);
        l.compile();

        Alien a=Context.getBean(Alien.class);

//        a.setAge(22);
        System.out.println(a.getAge());
        a.code();


    }
}
