package org.example;
import java.sql.*;
public class deleteData {
    public static void main(String[] args) throws Exception{


        String url="jdbc:postgresql://localhost:5432/demo";
        String uname="postgres";
        String pass="AaBb@#12";
        String query="Delete  from student where sid=105";

        Class.forName("org.postgresql.Driver");
        Connection con=DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection Established");

        Statement st=con.createStatement();
        st.execute(query);
        System.out.println("Deletion done");
        con.close();
        System.out.println("Connection closed");
    }
}
