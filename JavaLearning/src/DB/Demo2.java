package DB;
import java.sql.*;
public class Demo2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //2. Register
        Class.forName("com.mysql.cj.jdbc.Driver");
//        3. Create the connection
        String url="jdbc:mysql://localhost:3306/payrolldb";
        String username="root";
        String password="India@2010";
        Connection con=DriverManager.getConnection(url,username,password);
        Statement stmt=con.createStatement();
        String query="insert into employees values (101,\"Nandhini\",\"IT\",75000)";
        int rs=stmt.executeUpdate(query);
        System.out.println(rs+" is/are affected");
        con.close();
    }
}
