package JDBCDemo;

import java.sql.*;

public class JDBCDemo2 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // 1. Loading a Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2. Creating a connection

        String username = "root";
        String password = "root";
        String connectionURL = "jdbc:mysql://localhost:3306/school";

        Connection con = DriverManager.getConnection(connectionURL, username, password);

        //3. Creating a statement

        Statement st = con.createStatement();


        // 4. Executing the query - DDL

        String sql = "select * from student";
        ResultSet rs = st.executeQuery(sql);

        while (rs.next())
        {
            System.out.print(rs.getInt("id") +"\t");
            System.out.print(rs.getString("name")+"\t");
            System.out.print(rs.getString("branch")+"\t");
            System.out.println(rs.getInt("marks"));
        }




        st.close();
        con.close();



    }
}
