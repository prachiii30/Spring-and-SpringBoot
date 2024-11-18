package com.Prachi.Spring.Security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{

        //Disable thcsrf and no login form will be therr
        http.csrf(customizer->customizer.disable());
        http.authorizeHttpRequests(request->request.anyRequest().authenticated());

        //to  enable the loginform username and password
       http.formLogin(Customizer.withDefaults());  //for stateles we not need form login


        //for postman
        http.httpBasic(Customizer.withDefaults());
        http.sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
        return http.build();
    }

    //works with the dynamic values stored in the db but firt need the authentication provider obj mentioned

    @Autowired
    private  UserDetailsService userDetailsService;
        @Bean
    public AuthenticationProvider authProvider(){
            DaoAuthenticationProvider provider=new DaoAuthenticationProvider();

            provider.setUserDetailsService(userDetailsService);
            provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
            return provider;
        }

}



//works with the statuc value not the one store in db

//    @Bean
//    public UserDetailsService userDetailsService(){
//        UserDetails user= User.withDefaultPasswordEncoder()
//                .username("Prachi")
//                .password("12345678")
//                .roles("USER")
//                .build();
//        UserDetails admin= User.withDefaultPasswordEncoder()
//                .username("Youvraj")
//                .password("abcdef")
//                .roles("ADMIN")
//                .build();
//
//        return new InMemoryUserDetailsManager(user,admin);
//    }
