package com.prachi.Spring_Data_JpaExample;

import com.prachi.Spring_Data_JpaExample.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

//    JPQL stands for the Java Persistence Query Language
    @Query("select s from Student s where s.Name=?1")
    List<Student> findByName(String name);

    //jpql uses DSL Domain Specific Language using this it creates certain methods behind the scene
    // we can use those direct skipping @query
}
