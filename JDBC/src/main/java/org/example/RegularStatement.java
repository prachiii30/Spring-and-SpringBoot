package org.example;
import java.sql.*;
public class RegularStatement {
    public static void main(String[] args) throws Exception{
        String url="jdbc:postgresql://localhost:5432/demo";
        String uname="postgres";
        String pass="AaBba@#12";

        int id=125;
        String name="Ali";
        int marks=45;

        String query="Insert into student values("+id+",'"+name+"',"+marks+")";


        Class.forName("org.postgresql.Driver");
        Connection con= DriverManager.getConnection(url,uname,pass);
        System.out.println("connection established");

       Statement st= con.createStatement();
       st.execute(query);
       con.close();
        System.out.println("connection closed");
    }
}
