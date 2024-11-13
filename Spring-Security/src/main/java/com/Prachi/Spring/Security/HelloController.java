package com.Prachi.Spring.Security;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String greet(HttpServletRequest req){
        return "Hello world "+ req.getSession().getId();

    }
    @GetMapping("about")
    public String info(HttpServletRequest req){
        return "Hello Prachi "+ req.getSession().getId();

    }
}
