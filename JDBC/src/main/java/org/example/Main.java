
package org.example;
import org.postgresql.Driver;

import java.sql.*;
public class Main {
    public static void main(String[] args)  throws Exception{



    /*
    import package
    load and generate driver
    create connection
    create statement
    execute statement
    evaluate statement
    close
    */

        String url="jdbc:postgresql://localhost:5432/demo";
        String uname="postgres";
        String pass="AaBb@#12";
        String query="select sname from student where sid=106";


        Class.forName("org.postgresql.Driver");//load and generate driver it is optional
        Connection con= DriverManager.getConnection(url,uname,pass);

        System.out.println("connection established");

        // connection is an interface we have to look for implementation
        // so we use DriverManager.getConnection

        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query);
//        rs.next();//gives boolean value
        System.out.println(rs.next());

        String name=rs.getString("sname");
        System.out.println("name is "+name);



        con.close();
        System.out.println("connection closed");


}
}