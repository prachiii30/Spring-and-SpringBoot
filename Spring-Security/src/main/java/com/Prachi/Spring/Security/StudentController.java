package com.Prachi.Spring.Security;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class StudentController {

    List<Student> list=new ArrayList<>(List.of(
            new Student(1,"prachi","Java"),
            new Student(2,"Youvraj","Python")
    ));

    @GetMapping("csrf-token")
    public CsrfToken getroken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }
    @GetMapping("students")
    public List<Student> getAllStudent(){
        return list;

    }


//  without csrf token it will show error as unauthorized
// only get method works without csrf token

    @PostMapping("students")
    public void addStudent(@RequestBody Student st){
        list.add(st);
    }
}
