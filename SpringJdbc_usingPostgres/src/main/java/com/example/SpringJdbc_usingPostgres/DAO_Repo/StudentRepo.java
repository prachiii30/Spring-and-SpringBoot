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


    //ORM - object relation model- library to which we give the class and in return
    //it makes the table for us
    //reducting the time wastage and better utilization of time and resources

    //here we try to connec the relational world to the object world
    //to map these object world to the relation world we need orm tool this orm tool can be imple,emted using
    //hibernate , Top link

    //it like we give the class and the varibles defined to the hibernate and say it to create the table
    //hiberate knows how to do it
    //therfor e for each objec the entire row is occupied
    // now if we switch from hibernate to some other tool then we need to change the entire code
    //cant we define some specificstion that is useful to any tool
    //that specification which we do id known as JPA
    //even if we have change the library from hibernatte to anything
    //hibernate implements JPA
}

