package com.Prachi.SpringBootProject1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    //Dispatcher servlet is responsible for mapping
    @RequestMapping("/")
    public String home(){
        return "index.jsp";
    }

    //servlet way
//    @RequestMapping("/add")
//    public String add(HttpServletRequest req, HttpSession session){
//        int num1=Integer.parseInt(req.getParameter("num1"));
//        int num2=Integer.parseInt(req.getParameter("num2"));
//
//        int res=num1+num2;
//        System.out.println(res);
//
//        session.setAttribute("result",res);
//        return "result.jsp";
//
//    }

//    Spring way
@RequestMapping("/add")
    public String add(@RequestParam("num1") int n1,int num2,HttpSession session){

        int res=n1+num2;
        System.out.println(res);
        session.setAttribute("result",res);
        return "result.jsp";

    }



}
