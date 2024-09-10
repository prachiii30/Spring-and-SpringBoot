package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateData {
    public static void main(String[] args) throws Exception{

        String url="jdbc:postgresql://localhost:5432/demo";
        String uname="postgres";
        String pass="AaBb@#12";
        String query="Update student set sname='cookie' where sid=103";

        Class.forName("org.postgresql.Driver");
        Connection con= DriverManager.getConnection(url,uname,pass);

        System.out.println("Connection Established");

        Statement st=con.createStatement();
        st.execute(query);


        con.close();
        System.out.println("Connection Closed");

    }
}

