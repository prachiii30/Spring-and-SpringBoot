package com.prachi.Spring_Data_JpaExample;

import com.prachi.Spring_Data_JpaExample.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
}
