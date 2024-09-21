package com.Prachi.SpringJDBCusingH2.DAO_Repo;

import com.Prachi.SpringJDBCusingH2.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;



@Repository
public class StudentRepo {

    private JdbcTemplate jdbc;
    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }


    public void save(Student s) {
        String query="Insert into Student values(?,?,?)";
       int row= jdbc.update(query,s.getRoll(),s.getName(),s.getMarks());
        System.out.println(row+" Affected");//.update() method returns the int number of rows affected
    }

    public List<Student> findAll() {
        List<Student> students=new ArrayList<>();
        return students;
    }
}
