package com.Prachi.SpringBootProject1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    //Dispatcher servlet is responsible for mapping
    @RequestMapping("/")
    public String home(){
        return "index";
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
//@RequwsrParat 10 bar likhna pdega agr 10 obj h toh yh problem solve ho skti h model attribute se neeche example mention h
    public String add(@RequestParam("num1") int n1,int num2,HttpSession session){

        int res=n1+num2;
        System.out.println(res);
        session.setAttribute("result",res);
        return "result";

    }
//    @RequestMapping("/addAlien")
//    public ModelAndView addAlien(@RequestParam("aid") int n1, String aname, ModelAndView model){
//
//        Alien alien=new Alien();
//        alien.setAid(n1);
//        alien.setAname(aname);
//
//        model.addObject("alien",alien);
//        model.setViewName("result");
//        return model;
//
//    }

    @RequestMapping("/addAlien")
    public String addAlien(@ModelAttribute Alien alien){

        return "result";

    }



}
