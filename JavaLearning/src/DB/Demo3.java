package DB;

import java.sql.*;

public class Demo3 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        int id=102;
        String name="Suganya";
        String dept="HR";
        double salary=100000.00;
        //2. Register
        Class.forName("com.mysql.cj.jdbc.Driver");
//        3. Create the connection
        String url="jdbc:mysql://localhost:3306/payrolldb";
        String username="root";
        String password="India@2010";
        Connection con= DriverManager.getConnection(url,username,password);
        String query="insert into employees values (?,?,?,?)";
        PreparedStatement pst=con.prepareStatement(query);
        pst.setInt(1,id);
        pst.setString(2,name);
        pst.setString(3,dept);
        pst.setDouble(4,salary);

        int n=pst.executeUpdate();
        System.out.println(n+" row is/are inserted");
        con.close();
    }
}
