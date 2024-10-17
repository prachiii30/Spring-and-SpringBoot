package com.prachi.JobPortal.model;


import com.prachi.JobPortal.Service.jobService;
import com.prachi.JobPortal.jobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private jobService js;
    @RequestMapping({"/","home"})
    public String home(){
        return "home";
    }
    @RequestMapping("addjob")
    public String addJobs(){
        return "addJob";
    }
    @PostMapping ("handleForm")
        public String handleForm(jobPost jb, Model model){
        model.addAttribute("jb",jb);
        js.addJob(jb);
            return "success";
    }

    @GetMapping("viewalljobs")
    public String view(Model m){
       List<jobPost> list= js.getAllJob();
       m.addAttribute("jobPosts",list);
        return "viewAllJobs";
    }
}
