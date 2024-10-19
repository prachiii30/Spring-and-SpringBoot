package com.prachi.jobPortal_Rest;

import com.prachi.jobPortal_Rest.Service.JobService;
import com.prachi.jobPortal_Rest.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
//@ResponseBody
@RestController
@CrossOrigin("http://localhost:3000/")
public class jobControllerRest {

    @Autowired
    private JobService service ;

    @RequestMapping("posts")
    public List<JobPost> getAll(){
        return service.getAllJob();

    }
    @RequestMapping("posts/{postId}")
    public JobPost getJob(@PathVariable int postId){
        return service.getJob(postId);

    }

}
