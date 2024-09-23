package com.Prachi.SpringJDBCusingH2.Service;

import com.Prachi.SpringJDBCusingH2.DAO_Repo.StudentRepo;
import com.Prachi.SpringJDBCusingH2.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {



    @Autowired
    StudentRepo repo;
    public StudentRepo getRepo() {
        return repo;
    }

    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }


    public void addStudent(Student s){
        repo.save(s);
    }

    public List<Student> getStudents() {
        return repo.findAll();
    }
}