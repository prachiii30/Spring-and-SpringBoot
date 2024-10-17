package com.prachi.JobPortal.Service;

import com.prachi.JobPortal.jobPost;
import com.prachi.JobPortal.jobRepository.jobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class jobService {

    @Autowired
    private jobRepo repo;

    public void addJob(jobPost jb){
        repo.addJob(jb);
    }

    public List<jobPost> getAllJob(){
        return repo.getAllJobs();
    }
}
