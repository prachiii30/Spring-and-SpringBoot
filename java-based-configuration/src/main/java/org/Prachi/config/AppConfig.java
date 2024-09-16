package org.Prachi.config;

import org.Prachi.Alien;
import org.Prachi.Computer;
import org.Prachi.Desktop;
import org.Prachi.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import javax.naming.Name;
import java.security.PublicKey;

@Configuration
public class AppConfig {

    @Bean
    @Scope("prototype")
//    @Primary   if not want to use primary we can use Qualifier()
    public Desktop desk(){
        return new Desktop();
    }
    @Bean( name="lappp")
    public Laptop lap(){
        return new Laptop();
    }

//    @Bean
//    public Alien ali(){
//        return new Alien();
//
//    }
    //set the value here
//    @Bean
//    public Alien ali(){
//        Alien obj=new Alien();
//        obj.setAge(234);
//        return obj;
//    }

    @Bean
    public Alien ali( @Qualifier("lappp") Computer com){
        Alien obj=new Alien();
        obj.setAge(234);
        obj.setCom(com);
        return obj;
    }
}
