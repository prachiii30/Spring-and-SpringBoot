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
    private JobService service;

    @GetMapping("posts")
    public List<JobPost> getAll() {
        return service.getAllJob();

    }

    @GetMapping("posts/{postId}")
    public JobPost getJob(@PathVariable int postId) {
        return service.getJob(postId);

    }

    @PostMapping("PostById")
    public void addJob(@RequestBody JobPost jb) {
        service.addJob(jb);
    }

    @PutMapping("updatePost")
    public void update(@RequestBody JobPost jb) {
        service.update(jb);
    }

    @DeleteMapping("delpost/{postId}")
    public void delete(@PathVariable int postId) {
        service.del(postId);
    }

    @GetMapping("load")
    public String load() {
        service.load();
        return "Sucesss";
    }

    @GetMapping("keyword/{word}")
    public List<JobPost> getByKeyword(@PathVariable String word){
        return service.findWord(word);
}



}
