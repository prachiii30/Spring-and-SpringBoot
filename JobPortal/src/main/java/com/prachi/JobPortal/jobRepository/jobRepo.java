package com.prachi.JobPortal.jobRepository;

import com.prachi.JobPortal.jobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository

public class jobRepo {


    List<jobPost> list=new ArrayList<>(Arrays.asList());

    public void addJob(jobPost jb){

        list.add(jb);
        System.out.println(list);
    }

    public List<jobPost> getAllJobs(){
        return  list;
    }

}
