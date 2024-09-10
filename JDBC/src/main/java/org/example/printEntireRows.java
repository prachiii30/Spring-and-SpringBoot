package org.example;
import org.postgresql.Driver;

import java.sql.*;
public class printEntireRows {
    public static void main(String[] args) throws Exception {
        String url="jdbc:postgresql://localhost:5432/demo";
        String uname="postgres";
        String pass="AaBb@#12";


        String query="select * from student";


        Class.forName("org.postgresql.Driver");
        Connection con= DriverManager.getConnection(url,uname,pass);

        System.out.println("connection ban gya");

        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query);

        while(rs.next()){
            System.out.print(rs.getInt(1)+" -> ");
            System.out.print(rs.getString(2)+" -> ");
            System.out.println(rs.getString(3));
        }
        con.close();
    }
}
