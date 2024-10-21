package com.prachi.jobPortal_Rest.Service;

import com.prachi.jobPortal_Rest.model.JobPost;
import com.prachi.jobPortal_Rest.jobRepository.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void addJob(JobPost jb){
        repo.addJob(jb);
    }

    public List<JobPost> getAllJob(){
        return repo.getAllJobs();
    }

    public JobPost getJob(int postId) {
        return repo.getjob(postId);

    }

    public void update(JobPost jb) {
        repo.update(jb);
    }

    public void del(int postId) {
        repo.del(postId);
    }
}
