package com.prachi.jobPortal_Rest.jobRepository;

import com.prachi.jobPortal_Rest.model.JobPost;  // Updated import statement to match the class name
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> list = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Java Developer", "Looking for a skilled Java Developer", 3, Arrays.asList("Java", "Spring", "Hibernate")),
            new JobPost(2, "Frontend Developer", "Looking for a skilled Frontend Developer", 2, Arrays.asList("HTML", "CSS", "React")),
                        new JobPost(3, "Bembi Developer", "Looking for a skilled Frontend Developer", 2, Arrays.asList("HTML", "CSS", "React"))

            ));

    public void addJob(JobPost jb) {
        list.add(jb);
        System.out.println(list);
    }

    public List<JobPost> getAllJobs() {
        return list;
    }

    public JobPost getjob(int postId) {
        for(JobPost jb:list){
            if(jb.getPostId()==postId)
                return jb;
        }
       return  null;
    }
}
