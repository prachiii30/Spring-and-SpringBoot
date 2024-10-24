package com.prachi.jobPortal_Rest.jobRepository;

import com.prachi.jobPortal_Rest.model.JobPost;  // Updated import statement to match the class name
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<JobPost,Integer> {




    List<JobPost> findByPostProfileContainingOrPostDescContaining(String word, String word1);
}
