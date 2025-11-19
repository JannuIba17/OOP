package DB;
import java.sql.*;
/*
1. Import the packages
2. Load and Register the drivers
3. Create the connection
4. Create the statement
5. Execute the Query
6. Process the result
7. Close the connection
 */
public class JDBCConnectivity {
    public static void main(String[] args) throws Exception {
//      2. Register the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //3. create the connection
        String url="jdbc:mysql://localhost:3306/payrolldb";
        String username="root";
        String password="India@2010";
        Connection con=DriverManager.getConnection(url,username,password);
        System.out.println("Connection Established Successfully");
        //4. Create the statement=> Statement, PreparedStatement, CallableStatement
        Statement stmt=con.createStatement();
        //5. Execute the query=>execute(), executeQuery(), executeUpdate()
        String query="SELECT * from employees";
        ResultSet rs=stmt.executeQuery(query);
        while(rs.next()) {
            //6. Process the result
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getDouble(4));
        }
        //7. Close the connection
        con.close();
    }
}
