package JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {

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


        // 4. Executing the query - DML

       // String sql = "insert into student values(12,'Shirish','IT',87)";
      //  String sql = "update  student set branch='comp' where id=12";
        String sql = "delete from student where id=12";
        st.executeUpdate(sql);

        st.close();
        con.close();



    }
}
