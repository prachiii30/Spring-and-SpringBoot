package org.Prachi.config;


import org.Prachi.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    public Desktop dt(){
        return new Desktop();
    }

    @Bean(name = "lappy")
    @Scope(value ="prototype") // creates 2 different objects
    public Laptop lap(){
        return new Laptop();
    }
}
