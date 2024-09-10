package org.example;
import java.sql.*;
public class PreparedStatementss {
    public static void main(String[] args) throws Exception {
        String url="jdbc:postgresql://localhost:5432/demo";
        String uname="postgres";
        String pass="AaBba@#12";

        String query="Insert into student values (?,?,?)";

        int sid=455;
        String name="pihu";
        int marks=222;

        Class.forName("org.postgresql.Driver");
        Connection con=DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection Established");

        PreparedStatement st= con.prepareStatement(query);
        st.setInt(1,sid);
        st.setString(2,name);
        st.setInt(3,marks);
        st.execute();
        con.close();
        System.out.println("connection closed");


    }


}
