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

    //jpql usese DSL Domain Specific Lnaguage using this it create certains methods behind the scene
    // we can use those direct skippin @query
}
