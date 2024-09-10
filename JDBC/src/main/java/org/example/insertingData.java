package org.example;
import java.sql.*;
public class insertingData {
    public static void main(String[] args) throws Exception{

        String url="jdbc:postgresql://localhost:5432/demo";
        String uname="postgres";
        String pass="AaBb@#12";
        String query="Insert into student values(116,'xyz',96)";

        Class.forName("org.postgresql.Driver");
        Connection con=DriverManager.getConnection(url,uname,pass);

        System.out.println("Connection Established");

        Statement st=con.createStatement();
        boolean status=st.execute(query);
        System.out.println(status);

        con.close();
        System.out.println("Connection Closed");

    }
}
