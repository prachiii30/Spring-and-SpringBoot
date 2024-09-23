package com.example.SpringJdbc_usingPostgres.DAO_Repo;


import com.example.SpringJdbc_usingPostgres.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
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
        String query="Select * from Student";


        RowMapper<Student> rowmapper=new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student s = new Student();
                s.setRoll(rs.getInt("roll"));
                s.setName(rs.getString("name"));
                s.setMarks(rs.getInt("marks"));

                return s;
            }
        };


        return jdbc.query(query,rowmapper);//second is the object of rowmapper
        //in jdbc whenever  aquery is fired "RESULT SET " is obtained
        //rowmapper helps to get the data row by row from the result set
    }
}

