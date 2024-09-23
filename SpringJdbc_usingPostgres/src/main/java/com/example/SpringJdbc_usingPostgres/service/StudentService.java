package com.example.SpringJdbc_usingPostgres.service;

import com.example.SpringJdbc_usingPostgres.DAO_Repo.StudentRepo;
import com.example.SpringJdbc_usingPostgres.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo repo;

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
