package com.prachi.jobPortal_Rest.Service;

import com.prachi.jobPortal_Rest.model.JobPost;
import com.prachi.jobPortal_Rest.jobRepository.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void addJob(JobPost jb){
        repo.save(jb);
    }

    public List<JobPost> getAllJob(){
        return repo.findAll();
    }

    public JobPost getJob(int postId) {
        Optional<JobPost> jb=repo.findById(postId);
        return jb.orElse(new JobPost());

    }

    public void update(JobPost jb) {
        repo.save(jb);
    }

    public void del(int postId) {
        repo.deleteById(postId);
    }

    public void load() {
                List<JobPost> list = new ArrayList<>(List.of(
                        new JobPost(1, "Java Developer", "Looking for a skilled Java Developer", 3, Arrays.asList("Java", "Spring", "Hibernate")),
                        new JobPost(2, "Frontend Developer", "Looking for a skilled Frontend Developer", 2, Arrays.asList("HTML", "CSS", "React")),
                        new JobPost(3, "Bembi Developer", "Looking for a skilled Frontend Developer", 2, Arrays.asList("HTML", "CSS", "React"))

                ));

                repo.saveAll(list);

    }

    public List<JobPost> findWord(String word) {
       return repo.findByPostProfileContainingOrPostDescContaining(word,word);
    }
}
